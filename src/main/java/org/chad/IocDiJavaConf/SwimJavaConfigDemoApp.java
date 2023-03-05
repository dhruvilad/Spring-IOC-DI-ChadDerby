package org.chad.IocDiJavaConf;

import org.chad.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach1=context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());

        System.out.println(coach1.getEmail());
        System.out.println(coach1.getTeam());
        context.close();
    }
}
