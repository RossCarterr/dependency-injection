package carter.springframework.dependencyinjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Set in active profiles
@Profile("DE")
@Service("i18nService")
public class I18nGermanService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
