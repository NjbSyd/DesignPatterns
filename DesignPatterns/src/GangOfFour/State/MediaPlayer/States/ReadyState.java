package GangOfFour.State.MediaPlayer.States;

import GangOfFour.State.MediaPlayer.UI.Player;
import GangOfFour.State.MediaPlayer.UI.UI;

public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
        UI.changeLabelState("Ready");
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setLocked(true);
        player.setPlaying(false);
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.getIterator().next();
        player.changeState(new PlayingState(player));
        player.setPlaying(true);
        player.setLocked(false);
        return action;
    }

    @Override
    public String onNext() {
        return "Press Play...";
    }

    @Override
    public String onPrevious() {
        return "Press Play...";
    }
}