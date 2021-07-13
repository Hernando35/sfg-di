package com.hernandoguru.sfgdi.Config;


import com.hernandoguru.pets.DogPetService;
import com.hernandoguru.pets.PetService;
import com.hernandoguru.pets.PetsFactory;
import com.hernandoguru.sfgdi.Repositories.EnglishGreetingRepository;
import com.hernandoguru.sfgdi.Repositories.EnglishGreetingRepositoryImpl;
import com.hernandoguru.sfgdi.Services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetsFactory petsFactory(){
        return new PetsFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetsFactory petsFactory){
        return petsFactory.getPetService( "dog" );
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetsFactory petsFactory){
        return petsFactory.getPetService( "cat" );
    }

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
    PropertyInjectedGreetingsService propertyInjectedGreetingsService(){
          return new PropertyInjectedGreetingsService();
    }

    @Bean
    SetterInjectedGreetingsService setterInjectedGreetingsService(){
          return new SetterInjectedGreetingsService();
    }
}
