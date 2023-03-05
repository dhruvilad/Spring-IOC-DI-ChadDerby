package org.chad.IocDiXml;

import org.chad.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //add new fiels for emailaddress and team
    private String emailAddress;
    private String team;

    public CricketCoach() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("setter method injections emailaddress.......");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("setter method injections team.......");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter method injections fortuneService.......");
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
