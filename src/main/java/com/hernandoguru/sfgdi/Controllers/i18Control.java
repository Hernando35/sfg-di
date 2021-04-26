package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.ServiceCalling;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18Control {
    private final ServiceCalling serviceCalling;

    public i18Control(@Qualifier("i18nService") ServiceCalling serviceCalling) {
        this.serviceCalling = serviceCalling;
    }

    public String getServiceCalling() {
        return serviceCalling.getGreeting();
    }
}
