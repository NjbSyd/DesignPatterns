package GangOfFour.Template.Games;

public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void breakForRefreshments() {
        System.out.println("Football Game Break for Refreshments!");
    }

    @Override
    void performShiftNow() {
        System.out.println("Pools are Switched between Teams!");
        startPlay();
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
