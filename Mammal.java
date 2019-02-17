
public class Mammal extends Animal{

	public Mammal(String name) {
		super(name);
	}

	@Override
	public boolean isWarmBlooded(){
		return true;
	}
}
