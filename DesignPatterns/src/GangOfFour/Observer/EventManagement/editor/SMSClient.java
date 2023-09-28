package ObserverPattern_EventManagement.editor;

import ObserverPattern_EventManagement.publisher.EventManager;

import java.io.File;

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
