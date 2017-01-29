package vmiller.strategy_pattern;

public class AnimalTest {

	public static void main(String[] args) {

		Animal bello = new Dog();
		Animal tweety = new Bird();
		
		bello.setFavFood("Pedigree");
		bello.setName("Bello");
		
		System.out.println("Dog: "+bello.getFlyBehaviour()+"\nName: "+bello.getName()+"\nFavorite Food: "
		+bello.getFavFood());
		System.out.println("Bird: "+tweety.getFlyBehaviour());
		
		bello.setFlyBehaviour(new FlyWithWings());
		
		System.out.println("Dog learned to fly: "+bello.getFlyBehaviour());

	}

}
