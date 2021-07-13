package com.hernandoguru.sfgdi.Config;


import com.hernandoguru.sfgdi.Repositories.EnglishGreetingRepository;
import com.hernandoguru.sfgdi.Repositories.EnglishGreetingRepositoryImpl;
import com.hernandoguru.sfgdi.Services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile( {"ES","default"} )
    @Bean("i18nService")
    SpanishGreetingsService spanishGreetingsService(){
       return new SpanishGreetingsService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    EnglishGreetingsService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new EnglishGreetingsService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingsService primaryGreetingsService(){
         return new PrimaryGreetingsService();
    }

    @Bean
    ConstructorGreetingsService constructorGreetingsService(){
          return new ConstructorGreetingsService();
    }

    @Bean
    PropertyInjectedGreetingsService propertyInjectedGreetingsService(){
          return new PropertyInjectedGreetingsService();
    }

    @Bean
    SetterInjectedGreetingsService setterInjectedGreetingsService(){
          return new SetterInjectedGreetingsService();
    }
}
