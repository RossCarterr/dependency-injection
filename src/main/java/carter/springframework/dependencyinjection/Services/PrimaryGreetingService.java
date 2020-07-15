package carter.springframework.dependencyinjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Heelo World - From the Primary Bean";
    }
}
