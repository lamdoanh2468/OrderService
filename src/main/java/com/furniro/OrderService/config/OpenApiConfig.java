package com.furniro.OrderService.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order Service")
                        .version("1.0")
                        .description("Order Service"))
                .addServersItem(new Server()
                        .url("/api/v1/furniro/order-service")
                        .description("Gateway Server"));
    }
}
