package com.edsonfsousa.srvspringbootboilerplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Boilerplate API", version = "v1", description = "Documentação da Boilerplate API"))
public class SrvSpringbootBoilerplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrvSpringbootBoilerplateApplication.class, args);
    }

}