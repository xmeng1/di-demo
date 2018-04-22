package science.mengxin.didemo;

import static java.lang.System.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import science.mengxin.didemo.controllers.ConstructorInjectedController;
import science.mengxin.didemo.controllers.GetterInjectedController;
import science.mengxin.didemo.controllers.MyController;
import science.mengxin.didemo.controllers.PropertyInjectedController;
import science.mengxin.didemo.examplebeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();
        out.println(myController.hello());
        out.println(ctx.getBean(MyController.class).hello());
        out.println(ctx.getBean(PropertyInjectedController.class).hello());
        out.println(ctx.getBean(GetterInjectedController.class).hello());
        out.println(ctx.getBean(ConstructorInjectedController.class).hello());
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        out.print(fakeDataSource.toString());
	}
}
