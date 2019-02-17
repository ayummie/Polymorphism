
public class Bat extends Mammal implements Flyable{

	private int flightSpeed;
	
	public Bat(String name, int flightSpeed) {
		super(name);
		this.flightSpeed = flightSpeed;
	}

	@Override
	public int getFlightSpeed() {
		return flightSpeed;
	}

	
	

}
