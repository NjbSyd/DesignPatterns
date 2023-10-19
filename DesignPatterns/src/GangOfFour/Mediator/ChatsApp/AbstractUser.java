package GangOfFour.Mediator.ChatsApp;

public interface AbstractUser {
    String name();
    void sendMessage(String message, AbstractUser... users);
}
