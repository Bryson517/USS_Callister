package src;

public class Human {
	
	private String name;
	private double age;
	
	public Human(String nameIn, double ageIn) {
		name = nameIn;
		age = ageIn;
	}
	
	public void greeting() {
		System.out.println("Hello, my name is " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public double getAge() {
		return age;
	}
	
}





