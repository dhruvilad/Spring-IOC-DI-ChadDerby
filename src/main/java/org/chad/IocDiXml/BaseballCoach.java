package org.chad.IocDiXml;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public  BaseballCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    @Override
    public  String getDailyWorkout(){
        return "spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
