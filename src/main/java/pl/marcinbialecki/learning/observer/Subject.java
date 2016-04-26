package pl.marcinbialecki.learning.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Subject.
 */
public class Subject {

    /**
     * Observers list.
     */
    private List<AbstractObserver> observers;

    /**
     * State.
     */
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void registerObserver(final AbstractObserver observer) {
        if (observers == null) {
            observers = new CopyOnWriteArrayList<>();
        }
        observers.add(observer);
    }

    public void unregisterObserver(final AbstractObserver observer) {
        if (observers != null) {
            observers.remove(observer);
        }
    }

    public void notifyAllObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }

}