package com.coreSpring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface HotDrink {

    String prepareHotDrink();
}

class Restaurant {

    @Autowired
    private HotDrink hotDrink;

    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {

        return "Restaurant{" +
                "hotDrink=" + hotDrink.prepareHotDrink() +
                '}';
    }
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

public class Question9 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config4.xml");
        System.out.println(app.getBean("teaRestaurant"));
        ((ClassPathXmlApplicationContext) app).close();
    }
}
