package org.example.chapter4.proxies;

import org.example.chapter4.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}