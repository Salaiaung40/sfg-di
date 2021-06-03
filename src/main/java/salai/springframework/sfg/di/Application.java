package salai.springframework.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import salai.springframework.sfg.di.controllers.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);


        System.out.println("----------------- I18n controller ");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        MyController myController = (MyController) ctx.getBean("myController");

		/*
		String greeting = myController.sayHello();

		System.out.println(greeting);
        */
        System.out.println("------------- Primary bean");
        System.out.println(myController.sayHello());

        // working with springframework DI

        System.out.println(" ....... Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());
		/* This will get error coz spring does not know that the manage component.
		Thus you need to assign the annotated "@Controller" at PropertyInjectedController Class.
		And that add "@Autowired" to initialisation (public GreetingService greetingService).
		 */

        System.out.println(" ....... Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println(" ....... Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
