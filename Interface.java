package CSE;
//Interface
interface Animal {
public void animalSound(); // interface method
public void sleep(); // interface method (does not have a body)
}
//Dog "implements" the Animal interface
class Dog implements Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The Dog says:Bow Bow..");
}
public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
}

class Interface {
	  public static void main(String[] args) {
	    Dog myDog = new Dog();  // Create a Dog object
	    myDog.animalSound();
	    myDog.sleep();
	  }
	}
