package GangOfFour.Mediator.ChatsApp;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(AbstractUser user, String message, AbstractUser... receivers) {
        String recieverNames = "";
        for (AbstractUser receiver : receivers) {
            recieverNames += receiver.name() + ", ";
        }
        if(!recieverNames.isEmpty()) {
            recieverNames= recieverNames.substring(0, recieverNames.length() - 2);
        }
        System.out.println(new Date() + " [" + user.name() +"-> <"+recieverNames+ "> ] : " + message);
    }
}

