package pl.marcinbialecki.learning.observer;

/**
 * Created by Marcin Białecki on 2016-04-26.
 */
public class FirstObserver extends  AbstractObserver {

    public FirstObserver(final Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    protected void update() {
        System.out.println("FirstObserver: " + this.subject.getState());
    }

}