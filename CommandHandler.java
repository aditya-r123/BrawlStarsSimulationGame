
public interface CommandHandler {
	//This method will be used to handle user input. 
	public boolean execute(String command);
	
	//This method will be used to print information about the commands that can be handled.
	public void printHelp();
	
}
