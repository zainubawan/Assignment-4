public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() { //Bug 4: All throws are same for each game (corresponds with Dice.java)
		return DiceValue.getRandom();
	}		
	
	public String toString() {
		return value.toString();
	}
}
