
public class Frog extends Amphibian implements WaterLiveable{

	public Frog(String name) {
		super(name);
	}

	@Override
	public boolean canLiveOnLand() {
		return true;
	}
}
