package science.mengxin.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * <p>Date:    21/04/18
 *
 * @author mengxin
 * @version 1.0
 */

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hell - German greeting service";
    }
}
