package com.mss.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.mss.loans.controller") })
@EnableJpaRepositories("com.mss.loans.repository")
@EntityScan("com.mss.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "M-Bank Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Md. Tanver Ahammed",
                        email = "tutor@mss.com",
                        url = "https://github.com/Tanver-Ahammed"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/Tanver-Ahammed"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "M-Bank Loans microservice REST API Documentation",
                url = "https://github.com/Tanver-Ahammed"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }
}
