package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloConsumer helloConsumer = context.getBean(HelloConsumer.class);
        System.out.println(helloConsumer.consume());
    }
}
