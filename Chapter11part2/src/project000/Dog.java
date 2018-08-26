package project000;

public class Dog extends Animal{
	private int age = 0;
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void move(){
		System.out.println("Dog moves");
	}
	public String toString(){
		return "Dog " + super.getName() + " is " + age + " years old.";
	}
}
