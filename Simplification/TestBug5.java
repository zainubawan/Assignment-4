import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Testing Bug 5: Bet is always 5
 * This test checks in one game if all throws are the same.
 */
public class TestBug5 {

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
			

	        int totalWins = 0;
	        int totalLosses = 0;

	        
	        
	            //Testing one game
	            	String name = "Fred";
	            	int balance = 20;
	            	int limit = 0;
	                player = new Player(name, balance);
	                player.setLimit(limit);
	                int bet = 5;
                        
                        //Using the folloing statement to check the bet value
	                System.out.println("The bet placed is: " + bet);
                  
        }
}