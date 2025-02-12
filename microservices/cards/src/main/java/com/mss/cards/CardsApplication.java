package com.mss.cards;

import com.mss.cards.dto.CardContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.mss.cards.controller") })
@EnableJpaRepositories("com.mss.cards.repository")
@EntityScan("com.mss.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardContactInfoDto.class})
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "M-Bank Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Md. Tanver Ahammed",
                        email = "tanver@mss.com",
                        url = "https://github.com/Tanver-Ahammed"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/Tanver-Ahammed"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "M-Bank Cards microservice REST API Documentation",
                url = "https://github.com/Tanver-Ahammed"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }
}
