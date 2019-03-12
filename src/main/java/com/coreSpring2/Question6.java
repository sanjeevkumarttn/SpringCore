package com.coreSpring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface HotDrink {
    String prepareHotDrink();
}

class Restaurant {

    private HotDrink hotDrink;

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant() {
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

  /*  @Override
    public String toString() {

        return "Restaurant{" +
                "hotDrink=" + hotDrink.prepareHotDrink() +
                '}';
    }*/
}

class Tea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing Tea..";
    }
}

class ExpressTea implements HotDrink {

    @Override
    public String prepareHotDrink() {
        return "Preparing ExpressTea..";
    }
}

public class Question6 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config2.xml");
        System.out.println("Autowire byName");
        System.out.println(app.getBean("teaRestaurantByName"));
        System.out.println("Autowire byType");
        System.out.println(app.getBean("teaRestaurantByType"));
        System.out.println("Autowire Constructor");
        System.out.println(app.getBean("teaRestaurantConstructor"));
        ((ClassPathXmlApplicationContext) app).close();
    }
}
