

public class KeyRecipe extends Recipe {

	public KeyRecipe() {

		super(true, "bats", "shovel");

	}

	@Override
	public void combineInRoom(Room room) {

		System.out
				.println("You created a key! Next, solve the following riddles, where each riddle is a letter to the password needed to unlock the mega_box.");
		;
		@SuppressWarnings("unused")
		Key woks = new Key("key", "takes you to the next riddle");
		removeIngredientsFromRoom(room);
		String answer = "mortis";
		Riddle ri = new Riddle(answer, "");
		Container plc = new PasswordLockedContainer("mega_box",
				"a box that contains more surprises)", answer);
		

		Teleporter t1 = new Teleporter("red_portal",
				"takes you to Max's Superhero Training Academy");
		Teleporter t2 = new Teleporter("green_portal",
				"takes you to the Wild West");
		Teleporter t3 = new Teleporter("yellow_portal",
				"keeps you at Mr. P's Snowtel");
		Teleporter t4 = new Teleporter("blue_portal",
				"takes you to Gene's Lamporium");

		plc.add(t1);
		plc.add(t2);
		plc.add(t3);
		plc.add(t4);
		room.add(plc);
		ri.use();

	    System.out.println("An undead ghost appears out of nowhere!");
		System.out.println("It says: \"You have summoned me I see...I dread going to bed because I have not been fed with blood. So to make me vanish, take the correct portal in the mega_box!");
		System.out.println("As you start running, you realize there is no place to hide! You are still locked in the hotel room! Is there any way to escape!?!?!");
		System.out.println("The ghost continues: \"Even though you can tread ahead, there is no way you can catch up to meeee! I'm coming for youuuuuu! Mortis, bringer of doooom! Oooooooohhh!\"");
		System.out.println("You must make a move! Quickly!");

	}

}
