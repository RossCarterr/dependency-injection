package carter.sprignframework.dependencyinjection.Controllers;

import carter.sprignframework.dependencyinjection.Services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
