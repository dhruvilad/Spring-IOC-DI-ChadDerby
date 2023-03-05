package org.chad.IocDiJavaConf;

import org.chad.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach1=context.getBean("newCricketCoach", Coach.class);

        System.out.println(coach1.getDailyWorkout());

        context.close();
    }
}
