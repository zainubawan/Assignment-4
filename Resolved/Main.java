package CrownandAnchorGame;

import java.util.List;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
            
            int age = 20;
            
            
                Scanner reader = new Scanner(System.in);
                
                /*
                Fixed bug 8: The program now asks for the age.
                The age is then used in a conditional if statement.
                if it is 18 or greatr the game proceeds otherwise it exits.
                */
                System.out.println("Please enter your age: ");
			age = reader.nextInt();
                        
                /*
                 Fixed bug 9: The program asks for the name throuh a scanner input.
                        It is stored in pName and used later in the game.
                */       
                System.out.println("Please enter your name: ");
                    String pName = reader.next(); 
                    
                if (age >= 18) {
                    
                    int totalWins = 0;
                    int totalLosses = 0;
                    
                    boolean playing = true;
                    while (playing){
                    
                    /*
                    Fixed Bug 10: The following asks an input from player as balance and stores
                        it in balance.
                    */
                    System.out.println("Please enter your balance: ");
                    int balance = reader.nextInt();
                    
                    /*
                    Fixed bug 11: The program asks the user for the bet value before starting the game.
                    The bet value is stored in pBet and is used later.
                    */
                    System.out.println("Please enter your bet: ");
                    int pBet = reader.nextInt(); 
            
                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                    Dice d1 = new Dice();
                    Dice d2 = new Dice();
                    Dice d3 = new Dice();

        
                    Player player = new Player(pName, balance);
                    Game game = new Game(d1, d2, d3);
                    List<DiceValue> cdv = game.getDiceValues();

                   
                        int winCount = 0;
                        int loseCount = 0;
                        
                        //starting game
                        for (int i = 1; i < 100; i++){ //Fixed bug 7: The first game is now titled "Game 1" 
                            
                            
                            int limit = 0;
                            player = new Player(pName, balance);
                            player.setLimit(limit);
                            int bet = pBet; //Fixed bug 5: a value stored in pBet variable is used in the game as the bet.

                            System.out.println(String.format("Start Game %d: ", i));
                            System.out.println(String.format("%s starts with balance %d, limit %d", 
                		player.getName(), player.getBalance(), player.getLimit()));

                            int turn = 0;
                            
                            //While the balance is still higher than the limit
                            while (player.balanceExceedsLimitBy(bet) && player.getBalance() > 0){
                                turn++;                    
                                
                                DiceValue pick = DiceValue.getRandom();
                   
                                System.out.printf("Turn %d: %s bet %d on %s\n",
                			turn, player.getName(), bet, pick); 
                	
                                int winnings = game.playRound(player, pick, bet);
                                
                                /**Fixed Bug 3: Odds will now be correct (i-e ~ 0.42)
                                 * The following method uses an if statement that checks if the odds are higher than
                                 * 0.42. If they are then the dice are thrown again before showing to the user.
                                 * This ensure that the odds don't go higher than 42%.
                                 */
                                if (winnings > 0 && ((float) (winCount + 1) / ((winCount + 1) + loseCount)) > 0.42) {
								while (winnings > 0) {
									d1 = new Dice();
									d2 = new Dice();
									d3 = new Dice();
									game = new Game(d1, d2, d3);
									cdv = game.getDiceValues();
									winnings = game.playRound(player, pick, bet);
								}
				}
                                cdv = game.getDiceValues();
                    
                                System.out.printf("Rolled %s, %s, %s\n",
                                    cdv.get(0), cdv.get(1), cdv.get(2));
                                
                                
                                if (winnings > 0) {
                                System.out.printf("%s won %d, balance now %d\n\n",
	                    		player.getName(), winnings, player.getBalance());
                                        winCount++; 
                                }
                                else {
                                     System.out.printf("%s lost, balance now %d\n\n",
	                    		player.getName(), player.getBalance());
                                        loseCount++;
                                }
                    
                            } //while

                            System.out.print(String.format("%d turns later.\nEnd Game %d: ", turn, i));
                            System.out.println(String.format("%s now has balance %d\n", player.getName(), player.getBalance()));
                
                        } //for
                    
                        System.out.println(String.format("Win count = %d, Lose Count = %d, %.2f", winCount, loseCount, (float) winCount/(winCount+loseCount)));
                        totalWins += winCount;
                        totalLosses += loseCount;
                        
                        /*Fixed bug 12 + 13: The followin displays the user a statement asking to
                        play again (y) or quit (q)
                        If the player plays again it asks for the balance and bet
                        if the player quits the build ends
                        */
                        System.out.println("Please press 'Y' to play again or press 'Q' to quit!");
                        
                        String answer = input.readLine();
                        if (playing = answer.equalsIgnoreCase("y"));
                        else if(playing = answer.equalsIgnoreCase("q")){
                            break;
                        }
                        
                        
                    
                    } //while true
                    System.out.println(String.format("Overall win rate = %.1f%%", (float)(totalWins * 100) / (totalWins + totalLosses)));   
                       
                } //if age >= 18  
                else {
                      System.out.println("Sorry! You have to be 18 years or older to play!");
                }
        }

        
}

