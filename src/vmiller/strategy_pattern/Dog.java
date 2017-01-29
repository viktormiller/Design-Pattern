package vmiller.strategy_pattern;

public class Dog extends Animal {
	
	public Dog(){
		super();
		setSound("Bark");
		
		flyBehaviour = new NotFly();
	}
	
	public void digHole(){
		System.out.println("Dug a hole");
	}

}
