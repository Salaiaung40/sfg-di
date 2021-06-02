package salai.springframework.sfg.di.controllers;

// this is the most prefer method to make the controller with Constructor
// and most clean one

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.sfg.di.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());


    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}