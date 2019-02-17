
public class Goldfish extends Fish implements Adoptable, WaterLiveable{

	public Goldfish(String name) {
		super(name);
	}

	@Override
	public String getHomeCareInstructions() {
		return "Make sure to feed " + getName() + " with pellets or flakes.";
	}

	@Override
	public boolean canLiveOnLand() {
		return false;
	}

	
}
