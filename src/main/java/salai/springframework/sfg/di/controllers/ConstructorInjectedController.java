package salai.springframework.sfg.di.controllers;
//implementation of the constructor
//Controller another method

// this is the most prefer method to make the controller with Constructor

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import salai.springframework.sfg.di.services.GreetingService;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    // With the springFramework DI, does not need to write "@Autowired" coz this is the constructor method.
    //Thus it understand
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
