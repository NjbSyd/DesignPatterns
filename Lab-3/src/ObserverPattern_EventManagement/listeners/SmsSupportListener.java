package ObserverPattern_EventManagement.listeners;

public class SmsSupportListener implements EventListener<String> {
    private String phoneNumber;

    public SmsSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, String message) {
        if (message.length() >= 160) {
            System.out.println("SMS to " + phoneNumber + ": Someone has performed " + eventType + " operation with the following message: " + message);
        } else {
            System.out.println("SMS too Short for Minimum Length 160!");
        }

    }
}
