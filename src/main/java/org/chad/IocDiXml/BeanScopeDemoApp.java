package org.chad.IocDiXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach=context.getBean("myCoach", Coach.class);
        Coach coach1=context.getBean("myCoach", Coach.class);

        boolean result=(coach == coach1);
        System.out.println("Pointing to same object "+result);

        System.out.println("memory location for coach : "+coach);
        System.out.println("memory location for coach1 : "+coach1);

    }
}
