package org.chad.IocDiXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach coach=context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println("before close");
        context.close();
        System.out.println("after close");

    }
}
