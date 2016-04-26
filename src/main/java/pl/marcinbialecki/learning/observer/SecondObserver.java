package pl.marcinbialecki.learning.observer;

/**
 * Created by Marcin Białecki on 2016-04-26.
 */
public class SecondObserver extends AbstractObserver {
    public SecondObserver(final Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    protected void update() {
        System.out.println("SecondObserver: " + this.subject.getState());
    }
}
