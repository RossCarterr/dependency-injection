package carter.sprignframework.dependencyinjection.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Set in active profiles
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Jola Mundo - ES";
    }
}
