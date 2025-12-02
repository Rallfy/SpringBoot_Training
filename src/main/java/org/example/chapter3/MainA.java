package org.example.chapter3;

import org.springframework.context.annotation.*;

// DIRECT CALL
//@Configuration
//class ConfigA {
//    @Bean Parrot parrot() { return new Parrot("Koko"); }
//
//    @Bean Person person() {
//        var p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot()); // direct call
//        return p;
//    }
//}



// INJECT PARAM
@Configuration
class ConfigA {
    @Bean Parrot parrot() { return new Parrot("Koko"); }

    @Bean Person person(Parrot parrot) {
        var p = new Person();
        p.setName("Alhambra");
        p.setParrot(parrot);
        return p;
    }
}


public class MainA {
    static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ConfigA.class)) {
            System.out.println(ctx.getBean(Person.class).getParrot()); // Parrot: Koko
        }
    }
}
