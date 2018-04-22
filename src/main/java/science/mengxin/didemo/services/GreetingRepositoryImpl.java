package science.mengxin.didemo.services;

import org.springframework.stereotype.Component;

/**
 * <p>Date:    22/04/18
 *
 * @author mengxin
 * @version 1.0
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
