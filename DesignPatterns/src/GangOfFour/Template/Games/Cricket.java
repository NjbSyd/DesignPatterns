package GangOfFour.Template.Games;

public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void breakForRefreshments() {
        System.out.println("Cricket Game Break for Refreshments!");
    }
    @Override
    void performShiftNow() {
        System.out.println("Batting Team Started Fielding now!");
        startPlay();
    }
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
