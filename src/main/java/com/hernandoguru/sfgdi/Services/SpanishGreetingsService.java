package com.hernandoguru.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile( "ES" )
@Service("i18nService")
public class SpanishGreetingsService implements ServiceCalling{

    @Override
    public String getGreeting() {
        return "Hola mundo - ES";
    }
}
