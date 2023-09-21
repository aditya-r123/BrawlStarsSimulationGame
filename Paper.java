
public class Paper extends Item{
	String text;
	public Paper(String name, String description, String text){
		super(name, description);
		this.text = text;
	}
	@Override
	public void use() {
		System.out.println(text);
		
	}
	
	
}
