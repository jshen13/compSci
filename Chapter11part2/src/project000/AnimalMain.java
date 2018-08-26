package project000;

public class AnimalMain {
	public static void main(String[] args){
		Animal myAnimal = new Animal();
		Animal myAnimalDog = new Dog();
		Dog myDog = new Dog();
		myAnimal.setName("Tom");
		myAnimalDog.setName("Fido");
		myAnimalDog.move();
		myDog.setName("Bones");
		myDog.setAge(5);
		System.out.println(myAnimal);
		System.out.println(myAnimalDog);
		System.out.println(myDog);
	}
	
}
