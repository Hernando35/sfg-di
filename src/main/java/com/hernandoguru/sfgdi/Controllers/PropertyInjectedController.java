package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.ServiceCalling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingsService")
    @Autowired
    public ServiceCalling serviceCalling;

    public String getGreeting(){
        return serviceCalling.getGreeting();
    }
}