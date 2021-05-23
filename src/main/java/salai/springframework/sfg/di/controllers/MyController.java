package salai.springframework.sfg.di.controllers;
//Very basic and direct controller but not recommend to use it

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World from Salai!!");
        return "Hi Folks!!";
    }

}
