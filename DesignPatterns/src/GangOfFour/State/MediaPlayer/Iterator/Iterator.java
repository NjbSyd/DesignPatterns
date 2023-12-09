package GangOfFour.State.MediaPlayer.Iterator;

public interface Iterator<T> {
    T getCurrent();
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
    void reset();
}
