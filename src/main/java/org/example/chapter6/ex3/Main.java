package org.example.chapter6.ex3;

import org.example.chapter6.ex3.config.ProjectConfig;
import org.example.chapter6.ex3.model.Comment;
import org.example.chapter6.ex3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

        private static Logger logger =
                Logger.getLogger(Main.class.getName());

        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

            var service = context.getBean(CommentService.class);

            Comment comment = new Comment();
            comment.setText("Demo comment");
            comment.setAuthor("Natasha");

            String value = service.publishComment(comment);

            logger.info(value);
    }

}
