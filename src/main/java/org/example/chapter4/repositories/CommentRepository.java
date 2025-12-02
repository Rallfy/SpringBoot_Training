package org.example.chapter4.repositories;

import org.example.chapter4.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
