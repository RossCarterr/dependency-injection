package carter.sprignframework.dependencyinjection;

import carter.sprignframework.dependencyinjection.Controllers.ConstructorInjectedController;
import carter.sprignframework.dependencyinjection.Controllers.MyController;
import carter.sprignframework.dependencyinjection.Controllers.PropertyInjectedController;
import carter.sprignframework.dependencyinjection.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----- Property Bean");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter Bean");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor Bean");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
