package org.chad.IocDiAnnotation;

import org.chad.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        Coach coach1=context.getBean("newCricketCoach", Coach.class);
        Coach coach2=context.getBean("newCricketCoach", Coach.class);

        System.out.println(coach1);
        System.out.println(coach2);

        context.close();
    }
}
