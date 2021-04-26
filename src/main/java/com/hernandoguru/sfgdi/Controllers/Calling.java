package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.ServiceCalling;
import org.springframework.stereotype.Controller;

@Controller
public class Calling {

    private final ServiceCalling serviceCalling;

    public Calling(ServiceCalling serviceCalling) {
        this.serviceCalling = serviceCalling;
    }

    public String getGreeting(){
        return serviceCalling.getGreeting();
    }

}