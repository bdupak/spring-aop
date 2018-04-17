package com.epam;

import com.epam.service.CarService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CarService carService = context.getBean("carService", CarService.class);

        System.out.println(carService.getCar().getName());
        carService.getCar().setName("BMW");

        System.out.println(carService.getCar().getName());

        carService.getCar().rename("Test");

        context.close();
    }
}
