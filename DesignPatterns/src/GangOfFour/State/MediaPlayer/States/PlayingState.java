package GangOfFour.State.MediaPlayer.States;

import GangOfFour.State.MediaPlayer.Iterator.Iterator;
import GangOfFour.State.MediaPlayer.UI.Player;
import GangOfFour.State.MediaPlayer.UI.UI;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class PlayingState extends State {
    Iterator<String> iterator;
    Timer timer;

    PlayingState(Player player) {
        super(player);
        iterator = player.getIterator();
        UI.changeLabelState("Playing");
    }

    @Override
    public String onLock() {
        player.changeState(new StopState(player));
        player.setPlaying(false);
        iterator.reset();
        return "Stopped...";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setPlaying(false);
        return "Paused...";
    }

    @Override
    public String onNext() {
        String track = iterator.next();
        if (this.timer != null && !track.contains("Track 5")) {
            this.timer.cancel();
        }
        if (track.contains("Track 5")) {
            this.timer = trackTimer(track);
        }
        return track;
    }

    @Override
    public String onPrevious() {
        String track = iterator.previous();
        if (this.timer != null && !track.contains("Track 5")) {
            this.timer.cancel();
        }
        if (track.contains("Track 5")) {
            this.timer = trackTimer(track);
        }
        return track;
    }

    public Timer trackTimer(String track) {
        Timer tracktimer = new Timer();
        tracktimer.schedule(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, track + " has damaged the player!\nPlease reset the player.", "Player damaged", JOptionPane.ERROR_MESSAGE);
                tracktimer.cancel();
                player.changeState(new LockedState(player));
                UI.LockPlayer();
            }
        }, 3000, 1000);
        return tracktimer;
    }
}
