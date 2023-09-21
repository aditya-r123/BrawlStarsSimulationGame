
public class Driver {

	public static void main(String[] args) {
		
		String intro2 = "Gale: \"Hello. Welcome to the Snowtel. Woah! Who are you? I'm Gale, the senior bellman here. \nI'm assuming Mr. P already checked you in, so you can go to your room, "
				+ "and I'll bring the luggage for you in a minute.\"\n\nAs he is walking down the corridor, you hear Gale complain about how hard he has to work despite being old, all because of his evil boss, Mr. P.\nJust after Gale delivers the luggage and goes downstairs, you realize you have been trapped inside the room!\nThe stenches "
				+ "of the old hotel are building up and suffocating you! You need to get out as soon as possible!\nYou bang the door, no one is there. You try to use the telephone, but no answer. You "
				+ "try to scream, but no one hears you!\nBut you see a note on the table."
				+ " The note reads:\n---------------------------------------------------------------------------\n\nMWUAHAHAHAHAHAHA!\n\nYou have been trapped! You were the \"lucky\" customer!\nAnd before you ask, no, this is not a dream!\nTo escape the Snowtel room and go home, you must do all the activities in the correct sequences.\nAnd if you do that, you will get your reward.\n\nGood luck, although I doubt you can do it!"
				+ "\n Your evil bellman, \n  Gale\n---------------------------------------------------------------------------\n";
		WizardsLab lab = new WizardsLab("\n\nThis is the Snowtel Escape...", intro2, 15);
		new EscapeApp(lab).runGame();
	}

}
