package javapractices;

public class InheritanceInJava {

	public static void main(String[] args) {
		FourWheeler fourWheeler = new FourWheeler();

		fourWheeler.changeGear();
		System.out.println(fourWheeler.color);

		fourWheeler.doorOpeningMachanism();
		System.out.println(fourWheeler.numberOfDoors);
	}

}

class Vehicle {
	String manufacturer;
	String model;
	String color = "Red";
	float speed;

	public void changeGear() {
		System.out.println("Change gear");
	}

	public void breaking() {

	}
}

class TwoWheelerVehicle extends Vehicle {

	String handle;

}

class FourWheeler extends Vehicle {

	int numberOfDoors = 2;

	public void doorOpeningMachanism() {
		System.out.println("Open door by hydrolic system");
	}

}
