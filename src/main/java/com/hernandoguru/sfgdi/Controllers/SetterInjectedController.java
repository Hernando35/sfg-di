package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.ServiceCalling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private ServiceCalling serviceCalling;


    public String getServiceCalling() {
        return serviceCalling.getGreeting();
    }

    @Qualifier("setterInjectedGreetingsService")
    @Autowired
    public void setServiceCalling(ServiceCalling serviceCalling) {
        this.serviceCalling = serviceCalling;
    }
}
