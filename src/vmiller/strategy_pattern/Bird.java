package vmiller.strategy_pattern;

public class Bird extends Animal {
	
	public Bird(){
		super();
		setSound("Tweet");
		
		flyBehaviour = new FlyWithWings();
	}

}
