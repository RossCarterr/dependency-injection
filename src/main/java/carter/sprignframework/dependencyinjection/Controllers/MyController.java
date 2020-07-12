package carter.sprignframework.dependencyinjection.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        return "Hello World!!";
    }
}
