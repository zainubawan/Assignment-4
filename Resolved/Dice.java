package CrownandAnchorGame;

public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom();
	}		
	/*
        Fixed bug 4: The dice will have a different throw each time now.
        a new method was created to set the dice value as d.
        This will be used in the Game class.
        */
        public void setValue(DiceValue d) {  
		value = d;
	}
        
	public String toString() {
		return value.toString();
	}
}
