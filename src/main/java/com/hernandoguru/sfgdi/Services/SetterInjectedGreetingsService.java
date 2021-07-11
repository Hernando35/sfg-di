package com.hernandoguru.sfgdi.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


public class SetterInjectedGreetingsService implements ServiceCalling{

    @Override
    public String getGreeting() {
        return "Hello setter :)";
    }
}
