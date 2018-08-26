package chapter11;

public class RobotMain {
	public static void main (String[] args){
		Robot myRobot = new Robot();
		Robot18 myRobot18 = new Robot18();
		myRobot.doSomething();
		myRobot.move();
		
		myRobot18.shoot();
		myRobot18.doSomething();
		myRobot18.move();
		
	}
}
