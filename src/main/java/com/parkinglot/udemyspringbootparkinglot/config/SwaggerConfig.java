package com.parkinglot.udemyspringbootparkinglot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket bakeryApl(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("ParkingLot-apl").apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.parkinglot.udemyspringbootparkinglot.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("ParkingLot API")
                .description("ParkingLot API reference for developers")
                .termsOfServiceUrl("http://parkingLot.com")
                .contact(new Contact("ParkingLot web", "http://BakeryShop.com", "bakeryshop@gmail.com"))
                .license("ParkingLot license")
                .licenseUrl("parkingshop@gmail.com").version("5.0")
                .build();
    }

}
