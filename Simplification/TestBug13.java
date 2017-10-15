import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Testing Bug 13: The program ends after “q” is pressed
 * This test will show the working of this command
 * Since no display is shown to player they are unaware of this quitting option.
 */

public class TestBug13 {

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
		

	        while (true)
	        {
                    //Output statement to show the working of 'q'
                    System.out.println("Enter q to quit");
	            String ans = console.readLine();
	            if (ans.equals("q")) break;
	        } //while true
	        
	        
		}


}