package com.coreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question1And2 {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(app.getBean("database"));
        ((ClassPathXmlApplicationContext) app).close();

    }
}

class Database {
    private int port;
    private String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
