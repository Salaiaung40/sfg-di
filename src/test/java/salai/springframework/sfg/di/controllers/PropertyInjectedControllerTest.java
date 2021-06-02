package salai.springframework.sfg.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import salai.springframework.sfg.di.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUP() {
        controller =  new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeing() {

        System.out.println(controller.getGreeting());
    }
}