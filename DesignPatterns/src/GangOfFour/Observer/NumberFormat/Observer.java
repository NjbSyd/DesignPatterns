package ObserverPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
    public abstract String getClassName();
}