package foo.bar;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;

/**
 * Created by Martin on 23. 3. 2015.
 */
@Component
public class HelloConsumer extends AbstractService{

    private static final Logger logger = LogManager.getLogger(HelloConsumer.class);

    @Autowired
    private HelloService helloService;

    public String consume() {
        logger.info("consume() method running");

        if (consumeManager.canConsume()) {
            return helloService.sayHello();
        }

        return "Can't consume :(";
    }

}
