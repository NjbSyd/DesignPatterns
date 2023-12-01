package GangOfFour.Command.SubExpertExample;

public class Light {
    private boolean isOn;
    private String color;

    public Light(String color) {
        this.color = color;
    }

    public void switchOn() {
        if (isOn) {
            System.out.println(color+" Light is already on.");
            return;
        }
        System.out.println(color+" Light is on.");
    }

    public void switchOff() {
        if (!isOn) {
            System.out.println(color+" Light is already off.");
            return;
        }
        System.out.println(color+" Light is off");
    }

    public String getColor() {
        return color;
    }
}
