package GangOfFour.Command.SubExpertExample.Commands;

import GangOfFour.Command.SubExpertExample.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("-".repeat(40)+"\nSwitching on the " + this.light.getColor() + " light");
        light.switchOn();
    }
}
