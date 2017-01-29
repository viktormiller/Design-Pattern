package vmiller.strategy_pattern;

abstract class Animal {
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	FlyBehaviour flyBehaviour;
	
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setHeight(double newHeight){
		height = newHeight;
	}
	public double getHeight(){
		return height;
	}
	public void setWeight(int newWeight){
		if(newWeight > 0)
			weight = newWeight;
		else
			System.out.println("Weight must be bigger than 0");
	}
	public int getWeight(){
		return weight;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String newFavFood) {
		this.favFood = newFavFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double newSpeed) {
		this.speed = newSpeed;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String newSound) {
		this.sound = newSound;
	}
	
	public String getFlyBehaviour(){
		return flyBehaviour.fly();
	}
	
	public void setFlyBehaviour(FlyBehaviour newFlyBehaviour){
		this.flyBehaviour = newFlyBehaviour;
	}
	
}