package GangOfFour.State.MediaPlayer.Iterator;

import GangOfFour.State.MediaPlayer.UI.Player;

public class PlayerIterator implements Iterator<String> {
    private final Player player;
    private int index;

    public PlayerIterator(Player player) {
        this.player = player;
        this.index = -1;
    }

    @Override
    public String getCurrent() {
        return player.getPlaylist().get(index);
    }

    @Override
    public boolean hasNext() {
        return index < player.getPlaylist().size();
    }

    @Override
    public String next() {
        if (index >= player.getPlaylist().size()) {
            index = -1;
        }
        return player.getPlaylist().get(++index);
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public String previous() {
        if (index <= 0) {
            index = player.getPlaylist().size();
        }
        return player.getPlaylist().get(--index);
    }

    @Override
    public void reset() {
        this.index = -1;
    }
}
