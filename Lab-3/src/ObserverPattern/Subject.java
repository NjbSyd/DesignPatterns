package ObserverPattern;

public interface Subject {
    int getState();

    void setState(int state);

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObservers();
}
