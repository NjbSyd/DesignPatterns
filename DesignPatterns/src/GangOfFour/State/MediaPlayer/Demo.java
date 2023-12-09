package GangOfFour.State.MediaPlayer;

import GangOfFour.State.MediaPlayer.UI.Player;
import GangOfFour.State.MediaPlayer.UI.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}