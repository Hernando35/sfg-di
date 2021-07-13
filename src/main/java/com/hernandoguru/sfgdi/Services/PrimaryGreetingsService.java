package com.hernandoguru.sfgdi.Services;



public class PrimaryGreetingsService implements ServiceCalling {

    @Override
    public String getGreeting() {
        return "This is a PRIMARY Bean!";
    }
}
