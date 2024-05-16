package javapractices;

public class Dog {

	// instance/example/object member variables

	float age = 10.5f;

	float weight = 20.5f;

	String name = "tommy";

	String color = "black";

	// instance member functions/method

	public void eat() {

		System.out.println("Dog is eating");
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

	public void run() {
		System.out.println("Dog is running");
	}

	public static void main(String args[]) {

		Dog d = new Dog();

		System.out.println(d.color);
		d.bark();

	}
}
