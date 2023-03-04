package org.chad.IocDiAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewCricketCoach implements Coach{

    private FortuneService fortuneService;

    public NewCricketCoach() {
        System.out.println("inside constructor of new cricket");
    }

    @Autowired
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
}