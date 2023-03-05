package org.chad.IocDiAnnotation;

import org.chad.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        Coach coach=context.getBean("thatSillyCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        Coach coach1=context.getBean("newCricketCoach", Coach.class);

        System.out.println(coach1.getDailyWorkout());

        context.close();
    }
}
