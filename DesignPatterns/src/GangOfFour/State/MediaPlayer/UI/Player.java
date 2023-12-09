package GangOfFour.State.MediaPlayer.UI;

import GangOfFour.State.MediaPlayer.Iterator.Iterator;
import GangOfFour.State.MediaPlayer.Iterator.PlayerIterator;
import GangOfFour.State.MediaPlayer.States.ReadyState;
import GangOfFour.State.MediaPlayer.States.State;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Player {
    private State state;
    private boolean playing = false;
    Iterator<String> iterator;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    private boolean locked = false;
    private List<String> playlist = new ArrayList<>();

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        setLocked(false);
        for (int i = 1; i <= 12; i++) {
            playlist.add("Playing Track " + i);
        }
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

    public List<String> getPlaylist() {
        return playlist;
    }

    public Iterator<String> getIterator() {
        if (iterator == null) {
            iterator = new PlayerIterator(this);
        }
        return iterator;
    }
}
