package org.chad.IocDiAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewCricketCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public NewCricketCoach(FortuneService fortuneService) {
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
