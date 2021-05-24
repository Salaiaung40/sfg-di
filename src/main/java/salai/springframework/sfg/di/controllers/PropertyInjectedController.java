package salai.springframework.sfg.di.controllers;
//Controller another method with the property Injection method

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import salai.springframework.sfg.di.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired // this is telling Spring that inject this. Only place at the beginning.
    public GreetingService greetingService;

    // in this method there is no constructor.

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
