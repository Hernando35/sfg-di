package com.hernandoguru.sfgdi.Controllers;

import com.hernandoguru.sfgdi.Services.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingsService());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}