package project000;

public class Animal {
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
	public String toString(){
		return "Animal " + name;
	}
}
