package org.example.chapter5.ex1_2.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ex1_2
//@Configuration
//public class ProjectConfig {
//
//    @Bean                          // singleton by default
//    public CommentService commentService() {
//        return new CommentService();
//    }
//}


// ex2
@Configuration
@ComponentScan(basePackages = "org.example.chapter5.ex1_2")
public class ProjectConfig {
}

