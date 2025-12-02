package org.example.chapter5.ex1_2.services;

import org.example.chapter4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// ex1_2
//public class CommentService {
//    // empty – just used for identity checks
//}


// ex2
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
