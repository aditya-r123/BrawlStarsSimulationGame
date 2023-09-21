
public class Riddle extends Item{

	public Riddle(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("What comes once in a minute, twice in a moment, and never in a thousand years?");
		System.out.println("Which letter is worn around the finger, worn on the ear, and eaten in a bowl?");
		System.out.println("Two in a corner, one in a room, zero in a house, but one in a shelter. Which letter am I?");
		System.out.println("Which letter can be drank and used to place a golf ball on?");
		System.out.println("Which letter is the silent member of the British Parliament?");
		System.out.println("I am an odd number. If you take away one letter from me, I become even. What letter do I start with?");
		System.out.println("-------------------------------------------------------------------------------------------------------");

	}
}
