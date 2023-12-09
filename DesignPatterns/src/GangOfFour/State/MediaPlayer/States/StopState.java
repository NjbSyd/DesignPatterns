package GangOfFour.State.MediaPlayer.States;

import GangOfFour.State.MediaPlayer.UI.Player;
import GangOfFour.State.MediaPlayer.UI.UI;

public class StopState extends State {

    public StopState(Player player) {
        super(player);
        UI.changeLabelState("Stopped");
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setLocked(true);
        return "Locked...";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setLocked(false);
        return "Ready...";
    }

    @Override
    public String onNext() {
        return "Stopped...";
    }

    @Override
    public String onPrevious() {
        return "Stopped...";
    }
}
