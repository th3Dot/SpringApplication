package foo.bar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Martin on 23. 3. 2015.
 */

@Component
public class ConsumeManager {

    @Value("false")
    boolean consume;

    boolean canConsume() {
        return consume;
    }

}
