package GangOfFour.Mediator.ChatsApp;

public record User(String name) implements AbstractUser {
    @Override
    public void sendMessage(String message, AbstractUser... users) {
        ChatRoom.showMessage(this, message, users);
    }
}

