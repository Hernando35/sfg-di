package com.hernandoguru.sfgdi.Services;

import com.hernandoguru.sfgdi.Repositories.EnglishGreetingRepository;

public class EnglishGreetingsService implements ServiceCalling{
    private final EnglishGreetingRepository englishGreetingRepository;

    public EnglishGreetingsService(EnglishGreetingRepository englishGreetingRepository){
        this.englishGreetingRepository = englishGreetingRepository;
    }
    @Override
    public String getGreeting() {
        return "Hello world EN";
    }
}
