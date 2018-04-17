package com.epam.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl();
        System.out.println("Create proxy object");
        Person personProxy = (Person) Proxy.newProxyInstance(
                PersonImpl.class.getClassLoader(),
                PersonImpl.class.getInterfaces(),
                new CustomInvocationHandler(person));
//        System.out.println("Proxy " + personProxy.getName());
        personProxy.setName("Grisha");
        System.out.println("Set name = " + personProxy.getName());
        personProxy.rename("Xex");
        System.out.println();
    }
}
