
public class JumpPad extends Item{

	public JumpPad(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		if(getName().equals("jump_pad_right")){
			Key h = new Key("home_key", "unlocks the door to your house");
			getRoom().add(h);
			System.out.println("Safe at last! Home sweet home!");
			
			
		}else{
			System.out.println("You realize you accidentally jumped into the middle of Pam's junkyard. Before anyone sees, you quickly drink the erngy drink the Max gave you, and sprint back.");
		}
		
		
	}

}
