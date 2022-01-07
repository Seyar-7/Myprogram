
public class Interface_fish implements Interface_prey,Interface_predator{

	@Override
	public void hunt() {
		System.out.println("this fish is hunting smaller fish");
		
	}

	@Override
	public void flee() {
		System.out.println("this fish is fleeing from a larger fish");
		
	}
        
}
