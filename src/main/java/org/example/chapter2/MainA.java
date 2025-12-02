package org.example.chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainA {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(BeanConfig.class, ScanConfig.class);

        // programmatic bean
        Parrot dynamic = new Parrot("Kiki");
        ctx.registerBean("parrotDyn", Parrot.class, () -> dynamic, bd -> bd.setPrimary(true));

        // 1) By type now returns the PRIMARY bean (parrotDyn/Kiki):
        System.out.println(ctx.getBean(Parrot.class).getName()); // expect: Kiki

        // 2) By name for the others:
        System.out.println(ctx.getBean("parrot1", Parrot.class).getName()); // Koko
        System.out.println(ctx.getBean("parrot2", Parrot.class).getName()); // Miki
        System.out.println(ctx.getBean("parrotComponent", Parrot.class).getName()); // Riki
    }
}
