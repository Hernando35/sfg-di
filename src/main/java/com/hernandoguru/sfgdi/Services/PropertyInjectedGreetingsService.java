package com.hernandoguru.sfgdi.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingsService implements ServiceCalling{

    @Override
    public String getGreeting() {
        return "fake NullpointException :)";
    }
}
