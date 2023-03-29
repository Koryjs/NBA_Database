import org.json.simple.JSONObject;
import java.util.Scanner;
public class NBADriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the player to create");
        Player player = new Player(sc.nextLine());
        while (true) {
        System.out.println("Are there more games to input?");
        if (sc.nextLine().toUpperCase().equals("N"))
            break;
        player.setStats();
        }
        System.out.println(player.getAverages());
    }
}