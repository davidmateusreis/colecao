package com.david.gamecollection.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket gameListApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
                //.apiInfo(metaInfo());
    }

    /*private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Game List API REST",
                "API REST de lista de jogos.",
                "1.0",
                "Terms of Service",
                new Contact("David Mateus", "https://github.com/davidmateusreis",
                        "davidmateusreis@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>());

        return apiInfo;
    }*/
}
