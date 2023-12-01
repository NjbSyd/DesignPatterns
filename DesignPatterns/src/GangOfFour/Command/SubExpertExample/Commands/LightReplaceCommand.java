package GangOfFour.Command.SubExpertExample.Commands;

import GangOfFour.Command.SubExpertExample.Light;


public class LightReplaceCommand implements Command {
    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute(Light light) {
        System.out.println("-".repeat(40)+"\nSwitching off the " + this.light.getColor() + " light");
        this.light.switchOff();
        System.out.println("Light is replaced with " + light.getColor() + " light");
        this.light = light;
        System.out.println("Switching on the " + this.light.getColor() + " light");
        this.light.switchOn();
    }

    @Override
    public void execute() {
        execute(new Light("White"));
    }
}
