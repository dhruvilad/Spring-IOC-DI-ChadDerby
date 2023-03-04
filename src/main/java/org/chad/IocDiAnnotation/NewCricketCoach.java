package org.chad.IocDiAnnotation;

import org.springframework.stereotype.Component;

@Component
public class NewCricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {

        return "Practice your bowling";
    }
}
