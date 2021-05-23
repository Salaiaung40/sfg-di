package salai.springframework.sfg.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import salai.springframework.sfg.di.controllers.MyController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
