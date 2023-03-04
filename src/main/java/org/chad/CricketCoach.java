package org.chad;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter method injections.......");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Practice everyday for 3 hrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
