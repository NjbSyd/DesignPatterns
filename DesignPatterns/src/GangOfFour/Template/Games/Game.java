package GangOfFour.Template.Games;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    abstract void breakForRefreshments();

    abstract void performShiftNow();

    public final void play() {
        initialize();
        startPlay();
        breakForRefreshments();
        performShiftNow();
        endPlay();
    }
}

