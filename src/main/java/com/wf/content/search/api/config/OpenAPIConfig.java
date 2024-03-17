package com.wf.content.search.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("admin@wellsfargo.com");
        contact.setName("Wells Fargo");
        contact.setUrl("https://www.wellsfargo.com/");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Wells fargo Content Search API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints for content search in a documents.").termsOfService("https://www.wellsfargo.com/terms")
                .license(mitLicense);

        return new OpenAPI().info(info);
    }
}
