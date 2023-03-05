package org.chad.IocDiAnnotation;

import org.chad.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class NewCricketCoach implements Coach {

    private FortuneService fortuneService;

    public NewCricketCoach() {
        System.out.println("inside constructor of new cricket");
    }

    @Autowired
    @Qualifier("restFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("autoworing using setter in newcricket");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Practice your bowling";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


    @PostConstruct
    public  void doInitSTuff(){
        System.out.println("post construct called in  cricketcoach");
    }

    @PreDestroy
    public  void doDestroySTuff(){
        System.out.println("pre destroy called in  cricketcoach");
    }
}
