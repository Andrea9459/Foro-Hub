package Springdoc;

import org.springframework.context.annotation.Bean;

public class SpringDocConfigurations
@Bean
public OpenAPI customOpenAPI(){
    return new OpenAPI()
            .components(new Components()
                    .addSecuritySchemes("bearer-key",
                            new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
}

@Bean
public void message(){
    System.out.println("bearer is working");
}{
}
