package GangOfFour.Facade.Football;

// Facade
public class FootballFacade {
    private final PlayerManager playerManager;
    private final MatchScheduler matchScheduler;
    private final TeamDatabase teamDatabase;

    public FootballFacade() {
        this.playerManager = new PlayerManager();
        this.matchScheduler = new MatchScheduler();
        this.teamDatabase = new TeamDatabase();
    }

    public void getPlayerDetails(String playerName) {
        playerManager.getPlayerDetails(playerName);
    }

    public void getUpcomingMatches() {
        matchScheduler.getUpcomingMatches();
    }

    public void getTeamInfo(String teamName) {
        teamDatabase.getTeamInfo(teamName);
    }
}

