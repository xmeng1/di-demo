package science.mengxin.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * User:    mengxin
 * Date:    19/04/2018
 * Project: di-demo
 * Package: science.mengxin.services
 * Description: PrimaryGreetingService.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
@Primary  // this impl will be used primary if not qualifier
@Profile({"English", "default"})
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
