package science.mengxin.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import science.mengxin.services.GreetingService;

/**
 * User:    mengxin
 * Date:    28/03/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.controllers
 * Description: GetterInjectedController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String hello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
