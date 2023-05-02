
//StoreObject.java
import java.io.*;
import java.util.*;

public class StoreObject {
    public static void main(String[] args) {
        HashSet<Player> players = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter player " + (i+1) + " details:");
            Player player = Player.getPlayerObject();
            players.add(player);
        }
//        System.out.println(players);
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Player.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(players);
            oos.close();
            fos.close();
            System.out.println("Players stored successful in file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}