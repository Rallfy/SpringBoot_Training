package org.example.chapter4.commentapp;

import org.example.chapter4.config.ProjectConfiguration;
import org.example.chapter4.model.Comment;
import org.example.chapter4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//PLAIN EXAMPLE
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//
//        var commentService = new CommentService(commentRepository, commentNotificationProxy);
//
//        var comment = new Comment();
//        comment.setAuthor("Laurentiu");
//        comment.setText("Demo comment");
//
//        commentService.publishComment(comment);

        // <-- ADDED in ex2
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        service.publishComment(comment);
    }
}
