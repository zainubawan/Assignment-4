
import java.util.List;

/**
 * Testing Bug 4: All throws are same for each game
 * Testing Bug 6: Spades is never thrown
 * The following program gets the dice throw ten times.
 * All values are same.
 */
public class TestBug4and6 {

	/**
	 * Main class for simplified testing
	 */
	public static void main(String[] args) throws Exception{

	        Dice d1 = new Dice();
	        Dice d2 = new Dice();
	        Dice d3 = new Dice();

	        Player player = new Player("Fred", 20);
	        Game game = new Game(d1, d2, d3);
	        List<DiceValue> cdv = game.getDiceValues();
                
                for (int i= 0; i < 10; i++){
                System.out.println(cdv);
                 }
                 
                
        }
}