import java.util.ArrayList;
import java.util.HashMap;
public class Team {
    public ArrayList<Player> players;
    private String name;
    private String location;

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
        players = new ArrayList<Player>();
    }

    public String getFullName() {
        return location+" "+name;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }
    public void removePlayer(Player player) {
        players.remove(player);
    }
    public String toString() {
        String value = getFullName()+"\n";
        for (int a = 0; a < players.size(); a++) {
            value += players.get(a)+"\n";
        }
        return value;
    }
}
