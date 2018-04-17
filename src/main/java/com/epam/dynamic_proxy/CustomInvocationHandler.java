package com.epam.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private Object object;

    public CustomInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Let's invoke method  = " + method.getName());
        System.out.println("From object = " + proxy.getClass().getName());
        return method.invoke(proxy, args);
    }
}
