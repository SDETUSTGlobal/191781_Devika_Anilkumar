class Vehicle {

	void run() {
		System.out.println("Vehicle is running");
	}
}
 class Vehicle2 extends Vehicle{
     void run(){
        System.out.println("Vehicle2 is running"); 
     }
 }

public class Bike2 extends Vehicle {

	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		
		Vehicle vh= new Vehicle();
		Vehicle2 vh1= new Vehicle2();
		Bike2 vh3= new Bike2();
		vh1.run();
		vh.run();
		vh3.run();
	}
}