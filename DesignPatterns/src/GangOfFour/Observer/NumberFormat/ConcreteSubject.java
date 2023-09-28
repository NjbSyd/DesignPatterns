package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClassName()+" Attached!");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClassName()+" Removed!");
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}