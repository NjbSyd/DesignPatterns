
package GangOfFour.State;

import java.util.Iterator;
import java.util.List;

public class TrackIterator implements Iterator<String> {
    private List<String> tracks;
    private int index;

    public TrackIterator(List<String> tracks) {
        this.tracks = tracks;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < tracks.size() - 1;
    }

    @Override
    public String next() {
        return tracks.get(index++);
    }

    public int getCurrentIndex() {
        return index;
    }

    public void setCurrentIndex(int index) {
        this.index = index;
    }

    public void reset() {
        index = 0;
    }
}
