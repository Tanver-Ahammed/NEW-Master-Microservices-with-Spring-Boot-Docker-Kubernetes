#!/bin/bash

# Base directory for microservices
BASE_DIR="$(pwd)/microservices"

# List of microservices to build
SERVICES=("accounts" "loans" "cards" "configserver" "eurekaserver" "gatewayserver" "message")

# Function to build and containerize a microservice
build_service() {
    local service=$1
    local service_path="$BASE_DIR/$service"

    if [ -d "$service_path" ]; then
        cd "$service_path" || { echo "❌ Failed to navigate to $service_path"; exit 1; }
        echo "🚀 Building $service at $service_path..."
        mvn compile jib:dockerBuild || { echo "❌ Build failed for $service"; exit 1; }
    else
        echo "❌ Directory $service_path does not exist!"
        exit 1
    fi
}

# Build all microservices
for service in "${SERVICES[@]}"; do
    build_service "$service"
done

# Navigate to docker-compose directory
DOCKER_COMPOSE_DIR="$BASE_DIR/docker-compose"
read -p "Enter Environment (e.g., default, qa, prod): " env
ENV_PATH="$DOCKER_COMPOSE_DIR/$env"

if [ -d "$ENV_PATH" ]; then
    cd "$ENV_PATH" || { echo "❌ Failed to navigate to $ENV_PATH"; exit 1; }
    echo "🚢 Starting Docker Compose in $ENV_PATH..."
    docker compose up
else
    echo "❌ Environment directory $ENV_PATH does not exist!"
    exit 1
fi
