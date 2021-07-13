package com.hernandoguru.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class SpanishGreetingsService implements ServiceCalling{

    @Override
    public String getGreeting() {
        return "Hola mundo - ES";
    }
}
