package org.example.chapter4.services;

import org.example.chapter4.model.Comment;
import org.example.chapter4.proxies.CommentNotificationProxy;
import org.example.chapter4.repositories.CommentRepository;
import org.springframework.stereotype.Service;

//PLAIN EXAMPLE
//public class CommentService {
//    private final CommentRepository commentRepository;
//    private final CommentNotificationProxy commentNotificationProxy;
//
//    public CommentService(CommentRepository commentRepository,
//                          CommentNotificationProxy commentNotificationProxy) {
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//    }
//
//    public void publishComment(Comment comment) {
//        commentRepository.storeComment(comment);
//        commentNotificationProxy.sendComment(comment);
//    }
//}

//<-- ADDED in ex2
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}