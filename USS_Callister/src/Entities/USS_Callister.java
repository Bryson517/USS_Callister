package src.Entities;

public class USS_Callister {
	
	private String name;
	
	public USS_Callister(String nameIn) {
		name = nameIn;
	}
	
	
	
	public void printShipData() {
		System.out.println("Name: " + name);
	}
	
}