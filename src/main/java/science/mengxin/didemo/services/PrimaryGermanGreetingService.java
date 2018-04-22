package science.mengxin.didemo.services;

/**
 * <p>Date:    21/04/18
 *
 * @author mengxin
 * @version 1.0
 */

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hell - German greeting service";
    }
}
