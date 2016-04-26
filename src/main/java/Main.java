import pl.marcinbialecki.learning.observer.FirstObserver;
import pl.marcinbialecki.learning.observer.SecondObserver;
import pl.marcinbialecki.learning.observer.Subject;

/**
 * Created by Marcin Białecki on 2016-04-26.
 */
public class Main {

    public static void main(String[] args) {
        testObserver();
    }

    private static void testObserver() {
        Subject subject = new Subject();

        new FirstObserver(subject);
        new SecondObserver(subject);

        subject.setState(10);
    }

}
