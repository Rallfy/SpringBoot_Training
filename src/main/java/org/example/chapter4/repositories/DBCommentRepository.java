package org.example.chapter4.repositories;

import org.example.chapter4.model.Comment;
import org.springframework.stereotype.Repository;


// PLAIN EXAMPLE
//public class DBCommentRepository implements CommentRepository {
//
//    @Override
//    public void storeComment(Comment comment) {
//        System.out.println("Storing comment: " + comment.getText());
//    }

// <-- ADDED in ex2
@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}