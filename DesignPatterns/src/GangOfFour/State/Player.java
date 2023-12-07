
package GangOfFour.State;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Player {
    private State state;
    private boolean playing = false;
    private final List<String> playlist = new ArrayList<>();
    private final TrackIterator trackIterator;
    private Timer trackFiveTimer;
    private static final int TRACK_FIVE_INDEX = 5;

    public Player() {
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        this.trackIterator = new TrackIterator(playlist);
        this.state = new ReadyState(this);
        setupTrackFiveTimer();
    }

    private void setupTrackFiveTimer() {
        trackFiveTimer = new Timer();
        trackFiveTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (trackIterator.getCurrentIndex() == TRACK_FIVE_INDEX && isPlaying()) {
                    damagePlayer();
                }
            }
        }, 0, 1000);
    }

    private void damagePlayer() {
        JOptionPane.showMessageDialog(null, "Track 5 damaged the player. Please reset.");
        stopPlayback();
        trackFiveTimer.cancel();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        setPlaying(true);
        return "Playing " + playlist.get(trackIterator.getCurrentIndex());
    }

    public void stopPlayback() {
        setPlaying(false);
        trackFiveTimer.cancel();
        setupTrackFiveTimer();
    }

    public String nextTrack() {
        if (!trackIterator.hasNext()) {
            trackIterator.reset();
        }
        String track = trackIterator.next();
        return "Playing " + track;
    }

    public String previousTrack() {
        if (trackIterator.getCurrentIndex() == 0) {
            trackIterator.setCurrentIndex(playlist.size() - 1);
        } else {
            trackIterator.setCurrentIndex(trackIterator.getCurrentIndex() - 1);
        }
        return "Playing " + playlist.get(trackIterator.getCurrentIndex());
    }
}
