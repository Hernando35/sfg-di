package com.hernandoguru.sfgdi.config;


import com.hernandoguru.sfgdi.Services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

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
