package salai.springframework.sfg.di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService") // it is combine writing of Service + Qualifier
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - I18n";
    }
}
