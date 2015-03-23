package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Martin on 23. 3. 2015.
 */
public abstract class AbstractConsumer implements Consumable {

    @Autowired
    ConsumeManager consumeManager;

    @Override
    public abstract String consume();
}
