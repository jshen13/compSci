package chapter11;

public class AnimalMain {
	public static void main (String[] args){
		Animal myAnimal = new Animal();
		Cow myCow = new Cow();
		Dog myDog = new Dog();
		Dolphin myDolphin = new Dolphin();
		myCow.drink();
		myCow.eat();
		myCow.play();
		myCow.moo();
		myDog.drink();
		myDog.eat();
		myDog.play();
		myDog.bark();
		myDolphin.drink();
		myDolphin.eat();
		myDolphin.play();
		myDolphin.swim();
	}
}
