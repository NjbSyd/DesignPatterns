package GangOfFour.Observer.EventManagement.listeners;

public interface EventListener <T>{
    void update(String eventType, T file);
}