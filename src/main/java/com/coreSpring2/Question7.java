package com.coreSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-config2.xml");

        Restaurant restaurant1 = (Restaurant) app.getBean("teaRestaurant1");
        Restaurant restaurant2 = (Restaurant) app.getBean("teaRestaurant1");
        System.out.println(restaurant1);
        System.out.println(restaurant2);

        app.close();
    }
}
