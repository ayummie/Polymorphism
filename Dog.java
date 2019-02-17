
public class Dog extends Mammal implements Adoptable{

	public Dog(String name) {
		super(name);
	}

	@Override
	public String getHomeCareInstructions() {
		return "Give lots of love to " + getName() + ".";
	}

}
