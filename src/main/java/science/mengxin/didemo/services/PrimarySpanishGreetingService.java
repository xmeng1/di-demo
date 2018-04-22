package science.mengxin.didemo.services;

/**
 * <p>Date:    20/04/18
 *
 * @author mengxin
 * @version 1.0
 */

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "spanish greeting";
    }
}
