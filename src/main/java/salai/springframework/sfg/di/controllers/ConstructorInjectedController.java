package salai.springframework.sfg.di.controllers;
//implementation of the constructor
//Controller another method

// this is the most prefer method to make the controller with Constructor

import salai.springframework.sfg.di.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
