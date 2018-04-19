package science.mengxin.didemo.services;

import org.springframework.stereotype.Service;

/**
 * User:    mengxin
 * Date:    19/04/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.services
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
