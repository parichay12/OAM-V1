package com.example.demo;

import static springfox.documentation.builders.PathSelectors.regex;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Demo1Application {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(regex("/.*"))
                .build();
             
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
