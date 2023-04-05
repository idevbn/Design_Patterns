package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(final Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(final boolean status) {
        for (final Observer observer : observers) {
            observer.update(status);
        }
    }

}
