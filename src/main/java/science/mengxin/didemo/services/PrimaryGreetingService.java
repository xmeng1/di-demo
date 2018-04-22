package science.mengxin.didemo.services;

/**
 * User:    mengxin
 * Date:    19/04/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.services
 * Description: PrimaryGreetingService.
 *
 * @author mengxin
 * @version 1.0
 */


public class PrimaryGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
