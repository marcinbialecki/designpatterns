package pl.marcinbialecki.learning.observer;

/**
 * Observer abstract class.
 */
public abstract class AbstractObserver {

    /**
     * Subject/
     */
    protected Subject subject;

    /**
     * Update method.
     */
    protected abstract void update();
}