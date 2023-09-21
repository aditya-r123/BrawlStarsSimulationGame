import java.util.Random;

public class Coin extends Item{
	String text;
	public Coin(String name, String description, String text){
		super(name, description);
		this.text = text;
	}
	@Override
	public void use() {
		System.out.println(text);
		flipCoin();
		
	}
	
	public boolean flipCoin(){
		@SuppressWarnings("unused")
		Random random = new Random();
		
	    int rand = (int) (Math.floor(Math.random() * (1 - 0 + 1)) + 0);
		if(rand%2==0){
			System.out.println("The coin landed heads. Lucky ducky! You see this riddle that the coin projects:");
			System.out.println("At the beggining of their stay, marvelous monkeys made monsters mop my mess");
			System.out.println("After they left, sneaky snakes slithered somwhere surrounding the Snowtel");
			return true;
			
		}
		else{
			System.out.println("The coin landed tails. Haha! No riddle for you, one turn was wasted!");
			return false;
		}
	}
}
