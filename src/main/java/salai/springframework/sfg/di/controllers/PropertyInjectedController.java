package salai.springframework.sfg.di.controllers;
//Controller another method with the property Injection method

import salai.springframework.sfg.di.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
