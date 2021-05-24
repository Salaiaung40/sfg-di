package salai.springframework.sfg.di.controllers;

//Controller another method with setter Injection

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import salai.springframework.sfg.di.services.GreetingService;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Autowired // you can place at b4 constructor
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
