
public class WizardsLab extends Room {
	/** max number of turns the player can take before failing */
	int maxTurns;

	/** the number of turns the player has taken */
	int numTurns;

	/**
	 * Creates a Wizardslab with the given description, intro, and maxTurns
	 * 
	 * @param description
	 *            the description of the room
	 * @param intro
	 *            the introduction describing the scenario
	 * @param maxTurns
	 *            the number of turns the player can take before failing
	 */
	public WizardsLab(String description, String intro, int maxTurns) {

		super(description, intro);
		this.numTurns = 0;
		this.maxTurns = maxTurns;
		add(new KeyRecipe());
		Container chest = new PasswordLockedContainer("heist_safe",
				"a difficult to 2-18-5-1-11 safe", "break");
		chest.add(new UselessItem("hairspray",
				"further suffocates Snowtel customers"));
		chest.add(new UselessItem("energy_drink",
				"gives Gale energy when he gets tired"));
		chest.add(new UselessItem("bats",
				"flying creatures that poison whoever they bite"));
		chest.add(new UselessItem("shovel",
				"removes one of the above adverse effects"));
		add(chest);
		Paper stickyNote = new Paper("sticky_note",
				"Sprout's face on the front, and a riddle on the back",
				"The sticky note contains the following text:\n"
						+ "There was once a man who came back from the dead and likes the color red\n"
						+ "Spell out his name to go to the next step\n"
						+ "You recall Gale said in a puff\n"
						+ "I know just the stuff\n"
						+ "and then he said the name: ******.");

		add(stickyNote);

		System.out.print("");

	}

	@Override
	public void printRoomPrompt() {
		if (numTurns == 1) {
			System.out.println("You have taken " + numTurns
					+ " turn. You have " + (maxTurns - numTurns)
					+ " turns left to escape and go home.");
		} else if (maxTurns - numTurns == 1) {
			System.out.println("You have taken " + numTurns
					+ " turns. You have " + (maxTurns - numTurns)
					+ " turn left to escape and go home.");
		} else {
			System.out.println("You have taken " + numTurns
					+ " turns. You have " + (maxTurns - numTurns)
					+ " turns left to escape and go home.");
		}
	}

	@Override
	public void onCommandAttempted(String command, boolean handled) {
		command = command.toLowerCase();
		if (handled) {
			numTurns++;
		}
	}

	@Override
	public boolean escaped() {
		return getItem("home_key") != null;
	}

	@Override
	public void onEscaped() {
		System.out
				.println("Congratulations!\nYou escaped the Snowtel and made it home! (Gale was lying about the prize)\nYou completed the challenge in "
						+ numTurns + " turns!");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

	@Override
	public void onFailed() {
		System.out
				.println("Oh no!\nThe Snowtel employees track you down, have complete mind control over you, and now you cannot escape!!");
		System.out.println("Game Over");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

	@Override
	public boolean failed() {
		return numTurns >= maxTurns;
	}

	public int getMaxTurns() {
		return maxTurns;
	}

	public void setMaxTurns(int maxTurns) {
		this.maxTurns = maxTurns;
	}

	public int getNumTurns() {
		return numTurns;
	}

	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}

}
