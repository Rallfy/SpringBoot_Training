package org.example.chapter4.proxies;

import org.example.chapter4.model.Comment;
import org.springframework.stereotype.Component;


//PLAIN EXAMPLE
//public class EmailCommentNotificationProxy implements CommentNotificationProxy {
//
//    @Override
//    public void sendComment(Comment comment) {
//        System.out.println("Sending notification for comment: " + comment.getText());
//    }
//}


//<-- ADDED in ex2
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}