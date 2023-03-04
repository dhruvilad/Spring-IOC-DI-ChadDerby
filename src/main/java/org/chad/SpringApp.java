package org.chad;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        //load the spring configuartion file
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrive bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("cricketCoach", Coach.class);

        //call the methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getDailyWorkout());

        //close  the context
        context.close();
    }
}
