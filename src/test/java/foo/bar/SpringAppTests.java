package foo.bar;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloConsumer helloConsumer;

    @Autowired
    private ConsumeManager consumeManager;

    @Test
    public void testSayHello() {
        assertEquals("Hello!", helloService.sayHello());
    }

    @Test
    public void testSpringInheritance() { assertEquals("Can't consume :(", helloConsumer.consume()); }
}
