package foo.bar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Value("Hello!")
    String message;

    public String sayHello() {
        return message;
    }
}
