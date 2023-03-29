import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    public String name;
    public ArrayList<Double> points;
    public ArrayList<Double> rebounds;
    public ArrayList<Double> assists;
    public ArrayList<Double> steals;
    public ArrayList<Double> blocks;
    public ArrayList<Double> turnovers;
    public Scanner sc;
    /*public Role role;
    public ArrayList<Integer> fieldGoalsMade;
    public ArrayList<Integer> fieldGoalsAttempted;
    public ArrayList<Integer> threePointerMade;
    public ArrayList<Integer> threePointersAttempted;
    public ArrayList<Integer> freeThrowsMade;
    public ArrayList<Integer> freeThrowsAttempted;
*/
    public Player(String name) {
        this.name = name;
        points = new ArrayList<>();
        rebounds = new ArrayList<>();
        assists = new ArrayList<>();
        steals = new ArrayList<>();
        blocks = new ArrayList<>();
        turnovers = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    

    public void setStats() {
        System.out.println("Input the players statline in the format:\npoints rebounds assists steals blocks turnovers");
        String statline = sc.nextLine();
        String point = statline.substring(0, statline.indexOf(" "));
        points.add(Double.valueOf(point));
        statline = statline.substring(statline.indexOf(" ")+1);
        String rebound = statline.substring(0, statline.indexOf(" "));
        rebounds.add(Double.valueOf(rebound));
        statline = statline.substring(statline.indexOf(" ")+1);
        String assist = statline.substring(0, statline.indexOf(" "));
        assists.add(Double.valueOf(assist));
        statline = statline.substring(statline.indexOf(" ")+1);
        String steal = statline.substring(0, statline.indexOf(" "));
        steals.add(Double.valueOf(steal));
        statline = statline.substring(statline.indexOf(" ")+1);
        String block = statline.substring(0, statline.indexOf(" "));
        blocks.add(Double.valueOf(block));
        statline = statline.substring(statline.indexOf(" ")+1);
        //String turnover = statline.substring(0, statline.indexOf(" "));
        turnovers.add(Double.valueOf(statline));
    }

    public Double computeAverages(ArrayList<Double> values) {
        int average = 0;
        for (Double i: values) {
            average += i;
        }
        return average/((double) (values.size()));
    }

    public String getAverages() {
        double point = computeAverages(points);
        double rebound = computeAverages(rebounds);
        double assist = computeAverages(assists);
        double steal = computeAverages(steals);
        double block = computeAverages(blocks);
        double turnover = computeAverages(turnovers);
        return point+" "+rebound+" "+assist+" "+steal+" "+block+" "+turnover;
    }
}
