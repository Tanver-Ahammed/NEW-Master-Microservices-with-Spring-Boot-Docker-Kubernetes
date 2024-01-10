package com.eaztbytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Account Microservice REST API Documentation",
                description = "EazyBank Account Microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Md. Tanver Ahammed",
                        email = "tanvermbstuit16@gmail.com",
                        url = "https://github.com/Tanver-Ahammed"
                ),
                license = @License(
                        name = "Apache2.0",
                        url = "https://github.com/Tanver-Ahammed"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Accounts microservice REST API Documentation",
                url = "https://github.com/Tanver-Ahammed"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
