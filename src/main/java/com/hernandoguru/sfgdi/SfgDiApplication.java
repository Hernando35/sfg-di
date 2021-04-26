package com.hernandoguru.sfgdi;

import com.hernandoguru.sfgdi.Controllers.*;
import com.hernandoguru.sfgdi.Services.ConstructorGreetingsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        i18Control i18Control = (i18Control) ctx.getBean( "i18Control" );
        System.out.println(i18Control.getServiceCalling());


        Calling calling = (Calling) ctx.getBean( "calling" );
        System.out.println("------- Primary Bean");
        System.out.println(calling.getGreeting());
        System.out.println("----Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean( "propertyInjectedController" );
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("----Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean( "setterInjectedController" );
        System.out.println(setterInjectedController.getServiceCalling());
        System.out.println("----Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());
    }

}
