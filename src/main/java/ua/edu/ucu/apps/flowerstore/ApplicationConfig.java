package ua.edu.ucu.apps.flowerstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public String getData() {return "Hello world!";}
}
