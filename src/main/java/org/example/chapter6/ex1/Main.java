package org.example.chapter6.ex1;

import org.example.chapter6.ex1.config.ProjectConfig;
import org.example.chapter6.ex1.model.Comment;
import org.example.chapter6.ex1.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }

}
