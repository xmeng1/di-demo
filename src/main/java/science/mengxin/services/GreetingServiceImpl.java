package science.mengxin.services;

import org.springframework.stereotype.Service;

/**
 * User:    mengxin
 * Date:    28/03/2018
 * Project: di-demo
 * Package: science.mengxin.services
 * Description: GreetingServiceImpl.
 *
 * @author mengxin
 * @version 1.0
 */

@Service
public class GreetingServiceImpl implements GreetingService {


    @Override
    public String sayGreeting() {
        // System.out.println("sayGreeting invoke");
        return "Hello - I am GreetingServiceImpl";
    }
}
