package science.mengxin.didemo.services;

import org.springframework.stereotype.Service;

/**
 * User:    mengxin
 * Date:    19/04/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.services
 * Description: GetterGreetingService.
 *
 * @author mengxin
 * @version 1.0
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I am injected by the getter";
    }
}
