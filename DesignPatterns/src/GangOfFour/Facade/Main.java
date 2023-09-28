package GangOfFour.Facade;

public class Main {
    public static void main(String[] args) {
        FootballFacade footballFacade = new FootballFacade();

        footballFacade.getPlayerDetails("Cristiano Ronaldo");
        footballFacade.getUpcomingMatches();
        footballFacade.getTeamInfo("Real Madrid");
    }
}
