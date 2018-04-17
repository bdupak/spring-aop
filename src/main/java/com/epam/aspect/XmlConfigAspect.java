package com.epam.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlConfigAspect {
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
