package org.example.chapter2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Component
class Greeter {
    private String greeting;

    @PostConstruct
    void init() {
        // Pretend is loaded this from config/env; here we just set a default
        this.greeting = "Hello from @PostConstruct";
    }

    String say() { return greeting; }
}



public class MainB {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(ScanConfig.class);
        var g = ctx.getBean(Greeter.class);
        System.out.println(g.say()); // expect: Hello from @PostConstruct
    }
}
