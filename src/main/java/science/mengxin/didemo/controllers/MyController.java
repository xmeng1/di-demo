package science.mengxin.didemo.controllers;

import org.springframework.stereotype.Controller;
import science.mengxin.didemo.services.GreetingService;

/**
 * User:    mengxin
 * Date:    27/03/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.controllers
 * Description: MyController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        // System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
