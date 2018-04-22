package science.mengxin.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * <p>Date:    20/04/18
 *
 * @author mengxin
 * @version 1.0
 */

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "spanish greeting";
    }
}
