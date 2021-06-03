package salai.springframework.sfg.di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")// it is combine writing of Service + Qualifier
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello English - I18n";
    }
}
