package org.example.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class Parrot {
    private String name;

    public Parrot() {
    }

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot(" + name + ")";
    }
}

// Register via @Bean
@Configuration
class BeanConfig {
    @Bean("parrot1")
    Parrot p1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean("parrot2")
    Parrot p2() {
        return new Parrot("Miki");
    }
}

// Register via @Component + @ComponentScan
@Component
class ParrotComponent extends Parrot {
    public ParrotComponent() { super("Riki"); }
}

@Configuration
@ComponentScan(basePackages = "org.example.chapter2")
class ScanConfig {}