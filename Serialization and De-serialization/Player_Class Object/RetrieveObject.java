
//RetrieveObject.java
import java.io.*;
import java.util.*;

public class RetrieveObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Player.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashSet<Player> players = (HashSet<Player>) ois.readObject();
            ois.close();
            fis.close();
            for (Player player : players) {
                System.out.println(player.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
