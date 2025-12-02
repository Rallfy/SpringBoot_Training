package org.example.chapter5.ex1_2;

import org.example.chapter5.ex1_2.config.ProjectConfig;
import org.example.chapter5.ex1_2.services.CommentService;
import org.example.chapter5.ex1_2.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

//ex 1
//    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        var cs1 = context.getBean("commentService", CommentService.class);
//        var cs2 = context.getBean("commentService", CommentService.class);
//
//        boolean sameInstance = (cs1 == cs2);
//
//        System.out.println(sameInstance);
//    }


// ex 2
public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var s1 = context.getBean(CommentService.class);
    var s2 = context.getBean(UserService.class);

    boolean sameRepo =
            s1.getCommentRepository() == s2.getCommentRepository();

    System.out.println(sameRepo);
}

}
