package science.mengxin.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import science.mengxin.didemo.services.GreetingService;

/**
 * User:    mengxin
 * Date:    28/03/2018
 * Project: di-demo
 * Package: science.mengxin.didemo.controllers
 * Description: PropertyInjectedController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String hello(){
        return greetingService.sayGreeting();
    }
}
