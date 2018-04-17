package com.epam.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAspect {
    private long start;

    @Before("@annotation(com.epam.aspect.Test)")
    public void advice() {
        System.out.println("Annotation advice");
    }

    @Before("@annotation(com.epam.aspect.CalculateTime)")
    public void startCalculatePerformance() {
        System.out.println("Annotation CalculateTime");
        start = System.nanoTime();
    }

    @After("@annotation(com.epam.aspect.CalculateTime)")
    public void finishCalculatePerformance() {
        System.out.println("Annotation CalculateTime");
        System.out.println("Time: " + (System.nanoTime() - start));
    }
}
