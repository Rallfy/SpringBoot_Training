package org.example.chapter6.ex3.config;

import org.example.chapter6.ex3.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.chapter6.ex1")
@EnableAspectJAutoProxy       // enable AOP
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect() {  // aspect must be a bean
        return new LoggingAspect();
    }
}
