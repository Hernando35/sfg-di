package com.hernandoguru.sfgdi.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements ServiceCalling {

    @Override
    public String getGreeting() {
        return "This is a PRIMARY Bean!";
    }
}
