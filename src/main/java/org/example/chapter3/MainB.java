package org.example.chapter3;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component class ParrotComponent extends Parrot {
    ParrotComponent() { super("Riki"); }
}

@Component
class PersonComponent {
    private final Parrot parrot;
    PersonComponent(Parrot parrot) { this.parrot = parrot; } // constructor DI
    Parrot parrot() { return parrot; }
}

@Configuration @ComponentScan("org.example.chapter3") class ScanConfig {}

public class MainB {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ScanConfig.class)) {
            System.out.println(ctx.getBean(PersonComponent.class).parrot()); // Parrot: Riki
        }
    }
}