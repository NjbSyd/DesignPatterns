package GangOfFour.Command.SubExpertExample.Commands;

import GangOfFour.Command.SubExpertExample.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("-".repeat(40)+"\nSwitching off the " + this.light.getColor() + " light");
        light.switchOff();
    }
}

