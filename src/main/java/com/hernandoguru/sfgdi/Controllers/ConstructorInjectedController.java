package com.hernandoguru.sfgdi.Controllers;


import com.hernandoguru.sfgdi.Services.ConstructorGreetingsService;
import com.hernandoguru.sfgdi.Services.ServiceCalling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final ServiceCalling serviceCalling;

    public ConstructorInjectedController(@Qualifier("constructorGreetingsService") ServiceCalling serviceCalling) {
        this.serviceCalling = serviceCalling;
    }

    public String getGreetings(){
        return serviceCalling.getGreeting();
    }
}
