package GangOfFour.Observer.EventManagement;

import GangOfFour.Observer.EventManagement.editor.SMSClient;
import GangOfFour.Observer.EventManagement.listeners.SmsSupportListener;
import GangOfFour.Observer.EventManagement.listeners.EventListener;


public class Demo {
    public static void main(String[] args) {
        SMSClient smsClient = new SMSClient();
        smsClient.events.subscribe("send", (EventListener) new SmsSupportListener("+923439555964"));
        try {
            String message = "In a busy city, Najeeb met a mischievous emoji while coding. It playfully hopped through the code, making work fun. Together, they aced the project. \uD83D\uDE80As the day turned to night, their collaboration grew stronger. The code transformed into a masterpiece, impressing even the most seasoned developers. With a final flourish, they completed the project, a testament to the power of creativity and teamwork in the world of coding. From then on, Najeeb and the playful emoji became an unstoppable duo, known for turning challenges into triumphs. \uD83C\uDF1F\uD83D\uDC4F";
            smsClient.sendMessage("Too Short Message Test");
            smsClient.sendMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}