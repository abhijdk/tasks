
//Player.java
import java.io.*;
import java.text.*; 
import java.util.*;

class Player implements Serializable {
    private Integer playerNumber;
    private String playerName;
    private Double playerPrice;
    private Date dateOfAuction;

    public Player(Integer playerNumber, String playerName, Double playerPrice, Date dateOfAuction) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.playerPrice = playerPrice;
        this.dateOfAuction = dateOfAuction;
    }

    public static Player getPlayerObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player number: ");
        Integer playerNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        System.out.print("Enter player price: ");
        Double playerPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter date of auction (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        Date dateOfAuction = null;
        try {
            dateOfAuction = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Player(playerNumber, playerName, playerPrice, dateOfAuction);
    }

    @Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", playerName=" + playerName + ", playerPrice=" + playerPrice
				+ ", dateOfAuction=" + dateOfAuction + "]";
	}
}





