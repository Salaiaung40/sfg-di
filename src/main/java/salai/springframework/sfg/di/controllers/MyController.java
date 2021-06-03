package salai.springframework.sfg.di.controllers;
//Very basic and direct controller but not recommend to use it

import org.springframework.stereotype.Controller;
import salai.springframework.sfg.di.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
//        System.out.println("Hello World from Salai!!");
//        return "Hi Folks!!";
        return greetingService.sayGreeting();
    }

}
