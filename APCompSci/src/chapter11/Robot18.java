package chapter11;

public class Robot18 extends Robot {
	public Robot18(){
		System.out.println("New robot '18 created");
	}
	public void shoot(){
		System.out.println("robot '18 shoots");
	}
	public void move(){
		System.out.println("robot '18 moves");
		super.move();
	}
}
