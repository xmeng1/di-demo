package science.mengxin.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import science.mengxin.didemo.controllers.ConstructorInjectedController;
import science.mengxin.didemo.controllers.GetterInjectedController;
import science.mengxin.didemo.controllers.MyController;
import science.mengxin.didemo.controllers.PropertyInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"science.mengxin.services", "science.mengxin.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();
        System.out.println(myController.hello());
        System.out.println(ctx.getBean(MyController.class).hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).hello());
        System.out.println(ctx.getBean(GetterInjectedController.class).hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).hello());
	}
}
