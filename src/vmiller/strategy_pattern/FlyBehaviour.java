package vmiller.strategy_pattern;

public interface FlyBehaviour {
	String fly();
}

class FlyWithWings implements FlyBehaviour{
	@Override
	public String fly() {
		return "I fly with wings";
	}
}
class NotFly implements FlyBehaviour{
	@Override
	public String fly() {
		return "I can't fly";
	}
}