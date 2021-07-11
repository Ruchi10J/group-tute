import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection {



    public static void main(String[] args) {

        ArrayList<Player> Players = new ArrayList<Player>();
        Player p1 = new Player("Dimuth Karunarathne", 33, "batsman", 5176);
        Player p2 = new Player("Suranaga Lakmal", 34, "spin bowler", 167);
        Player p3 = new Player("Dilruwan Perera", 38, "batsman", 63);

        Players.add(p1);
        Players.add(p2);
        Players.add(p3);

        Scanner obj = new Scanner(System.in);
        int choice = 0;
        while (choice != 2) {
            System.out.println("");
            System.out.println("To add player              :Press 1");
            System.out.println("To view details            :Press 2");

            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.println("Enter the name of player:");
                    String playerName = obj.next();
                    System.out.println("Enter the age of player:");
                    int playerAge = obj.nextInt();
                    System.out.println("Enter the type of player:");
                    String playerType = obj.next();
                    System.out.println("Enter the statistics of player:");
                    int playerStatistics = obj.nextInt();
                    Player p4=new Player(playerName,playerAge,playerType,playerStatistics);


                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Details of the Players");
                    p1.getPlayerDetails();
                    p2.getPlayerDetails();
                    p3.getPlayerDetails();



                    break;

                default:
                    System.out.println("");
                    System.out.println("Invalid Choice:");
            }
        }
    }

}









