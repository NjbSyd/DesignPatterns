package ObserverPattern_EventManagement.listeners;

public interface EventListener <T>{
    void update(String eventType, T file);
}