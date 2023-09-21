public class Teleporter extends Item {

	public Teleporter(String name, String description) {
		super(name, description);

	}

	@Override
	public void use() {
		
		if (getName().equals("red_portal")) {
			System.out
					.println("You have successfully escaped the Snowtel. But now, you have to go back home.\nAfter you take the red portal, you find yourself at Max's Hero Training Academy. Here, Max zips right in front of you and hands you this brawl_box.");
			System.out
					.println("Max also hands you a bottle of her newly developed energy drink! It's based on Lou's Mango-Tango snow cone flavor!");
			System.out
					.println("Max quickly says \"thepasswordtotheboxigaveyouismynameandbythewaywearenottothenorthorsouthofyourhousesoweareeithereastorwest\" and dashes away");
			Container c = new PasswordLockedContainer("brawl_box",
					"contains even more surprises", "max");
			JumpPad j1 = new JumpPad("jump_pad_up", "Takes you north");
			JumpPad j2 = new JumpPad("jump_pad_down", "Takes you south");
			JumpPad j3 = new JumpPad("jump_pad_left", "Takes you west");
			JumpPad j4 = new JumpPad("jump_pad_right", "Takes you east");
			c.add(j1);
			c.add(j2);
			c.add(j3);
			c.add(j4);
			getRoom().add(c);
		} else if (getName().equals("green_portal")
				|| getName().equals("blue_portal")) {
			System.out
					.println("You went to a desert! It's way too hot for you in your heavy winter jacket, so you teleport back to your hotel room.");
		} else if (getName().equals("yellow_portal")) {
			System.out.println("You stay in the Snowtel, nothing happens!");
		}

	}

}
