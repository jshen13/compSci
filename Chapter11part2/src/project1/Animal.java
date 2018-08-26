package project1;

public abstract class Animal {
	private String name = "";
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void move(){
		System.out.println("Animal moves");
	}
	public void eat(){
		System.out.println("Anmial eats");
	}
}
