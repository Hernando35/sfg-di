package com.hernandoguru.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile( "EN" )
@Service("i18nService")
public class EnglishGreetingsService implements ServiceCalling{

    @Override
    public String getGreeting() {
        return "Hello world EN";
    }
}
