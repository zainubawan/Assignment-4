import java.util.List;
import java.io.*;


/**
 * Bug 7: First game should be titled “Game 1” instead of “Game 0”.
 * The test uses print output statement to check the title of the first game 
 * of the complete iteration.
 */
public class TestBug7 {
	
	public static void main(String[] args) throws Exception {
		
	

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();

        Player player = new Player("Fred", 100);
        Game game = new Game(d1, d2, d3);
        List<DiceValue> cdv = game.getDiceValues();


            for (int i = 0; i < 1; i++)
            {
                System.out.println(String.format("First game is, Game " + i));
            }
        
        }
}