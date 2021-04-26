package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setServiceCalling( new ConstructorGreetingsService() );
    }

    @Test
    void getServiceCalling() {
        System.out.println(setterInjectedController.getServiceCalling());
    }

}