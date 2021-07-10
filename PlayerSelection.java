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
        Scanner obj=new Scanner(System.in);
        int choice=0;
        while (choice!=2){
            System.out.println("");
            System.out.println("To add player           :Press A");
            System.out.println("To view details            :Press V");

            choice = obj.nextInt();
            switch (choice){
                case 1:
                    System.out.println("");
                    System.out.println("Enter the name of player:");
                    String playerName=obj.next();
                    System.out.println(playerName+ "player is added");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Details of the players");

                    Player.playerDetails();
                    break;

                default:
                    System.out.println("");
                    System.out.println("Invalid choice:");
            }
        }
    }
}




