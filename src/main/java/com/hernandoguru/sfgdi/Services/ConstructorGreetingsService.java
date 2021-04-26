package com.hernandoguru.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsService implements ServiceCalling {
    public String getGreeting(){
        return "Hello worldgit ! - Constructor";
    }
}
