package GangOfFour.Facade.Football;

import java.util.HashMap;
import java.util.Map;

public class PlayerManager {
    private final Map<String, String> playerDetails;

    public PlayerManager() {
        playerDetails = new HashMap<>();
        playerDetails.put("Lionel Messi", "Team: Paris Saint-Germain, Position: Forward, Age: 34");
        playerDetails.put("Cristiano Ronaldo", "Team: Manchester United, Position: Forward, Age: 36");
        playerDetails.put("Neymar Jr.", "Team: Paris Saint-Germain, Position: Forward, Age: 29");
        playerDetails.put("Kylian Mbappé", "Team: Paris Saint-Germain, Position: Forward, Age: 22");
        playerDetails.put("Kevin De Bruyne", "Team: Manchester City, Position: Midfielder, Age: 30");
        playerDetails.put("Robert Lewandowski", "Team: Bayern Munich, Position: Forward, Age: 33");
        playerDetails.put("Karim Benzema", "Team: Real Madrid, Position: Forward, Age: 33");
        playerDetails.put("Mohamed Salah", "Team: Liverpool, Position: Forward, Age: 29");
        playerDetails.put("Sergio Ramos", "Team: Paris Saint-Germain, Position: Defender, Age: 35");
        playerDetails.put("Virgil van Dijk", "Team: Liverpool, Position: Defender, Age: 30");
    }

    public void getPlayerDetails(String playerName) {
        System.out.println("Getting details for player: " + playerName);
        System.out.println(playerDetails.get(playerName));
    }
}