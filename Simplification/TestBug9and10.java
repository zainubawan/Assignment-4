import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Testing Bug 1: Incorrect pay out
 * This test will show what the balance should be before winning
 * and what the game is showing as the balance.
 */

public class TestBug9and10 {

	/**
	 * Main class for simplified testing
	 */
	public static void main(String[] args) throws Exception {
		
		   BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	        Dice d1 = new Dice();
	        Dice d2 = new Dice();
	        Dice d3 = new Dice();

	        Player player = new Player("Fred", 20);
	        Game game = new Game(d1, d2, d3);
	        List<DiceValue> cdv = game.getDiceValues();
		

                String name = "Fred";
	        int balance = 20;
	        player = new Player(name, balance);
	        
                System.out.println("The name of player is " + name);
                System.out.println("The balance of player is " + balance);
        }
}
                        
