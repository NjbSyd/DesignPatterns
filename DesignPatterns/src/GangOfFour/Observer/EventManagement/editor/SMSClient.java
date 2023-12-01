package GangOfFour.Observer.EventManagement.editor;

import GangOfFour.Observer.EventManagement.publisher.EventManager;

public class SMSClient {
    public EventManager events;
    private String message;

    public SMSClient() {
        this.events = new EventManager("send");
    }

    public void sendMessage(String message) {
        this.message = message;
        events.notify("send", message);
    }
}
