package org.example.chapter5.ex3.services;

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

    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
