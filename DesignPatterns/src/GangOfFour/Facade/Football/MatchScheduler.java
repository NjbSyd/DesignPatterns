package GangOfFour.Facade.Football;

public class MatchScheduler {
    private final String[] fakeMatchSchedules = {
            "Match ID: 1, Teams: Team Alpha vs Team Beta, Date: 2023-10-02, Time: 15:00",
            "Match ID: 2, Teams: Team Gamma vs Team Delta, Date: 2023-10-05, Time: 17:30",
            "Match ID: 3, Teams: Team Epsilon vs Team Zeta, Date: 2023-10-08, Time: 14:15",
            "Match ID: 4, Teams: Team Theta vs Team Iota, Date: 2023-10-11, Time: 16:45"
    };

    public void getUpcomingMatches() {
        System.out.println("Upcoming matches:");
        for (String matchSchedule : fakeMatchSchedules) {
            System.out.println(matchSchedule);
        }
    }


}
