package com.epam.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Aspects {

    @Before("execution(* com.epam.service.*.get*())")
    public void someAdvice() {
        System.out.println(":Advise: This advice you can see when called getter methods in service package");
    }

    @Before("execution(public String getName()))")
    public void customAdvice() {
        System.out.println(":Advice: This advice you can see when called method getName()");
    }
}
