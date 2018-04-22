package science.mengxin.services;

import org.springframework.stereotype.Service;

/**
 * User:    mengxin
 * Date:    19/04/2018
 * Project: di-demo
 * Package: science.mengxin.services
 * Description: ConstructorGreetingService.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Helli - I was injected via the constructor!!";
    }
}
