package org.example.chapter6.ex3.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.chapter6.ex3.model.Comment;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger =
            Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.chapter6.ex3.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");

        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object[] newArguments = { comment };

        Object returnedByMethod = joinPoint.proceed(newArguments); // changed args

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }
}
