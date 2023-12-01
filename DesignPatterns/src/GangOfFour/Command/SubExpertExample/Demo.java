package GangOfFour.Command.SubExpertExample;

import GangOfFour.Command.SubExpertExample.Commands.LightOffCommand;
import GangOfFour.Command.SubExpertExample.Commands.LightOnCommand;
import GangOfFour.Command.SubExpertExample.Commands.LightReplaceCommand;

public class Demo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Blue");
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
        remoteControl.setCommand(new LightReplaceCommand(light));
        remoteControl.pressButton();
    }
}
