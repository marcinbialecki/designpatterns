package pl.marcinbialecki.learning.observer;

import org.junit.Test;

/**
 * Created by Marcin Białecki on 2016-04-26.
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        Subject subject = new Subject();

        new FirstObserver(subject);
        new SecondObserver(subject);

        subject.setState(10);
    }

}
