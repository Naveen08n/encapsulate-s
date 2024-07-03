import java.util.Scanner;

abstract class Vehicle_details{
	private int distance;
	private int fuel;
	static float result;
	public void acceptInput() {
		
		Scanner scan=new Scanner(System.in);
		distance=scan.nextInt();
		fuel=scan.nextInt();
	}
	public void calcFuelEfficiency() {
		result=distance/fuel;
	}

	abstract void disFuelEfficiency();
}
class Car extends Vehicle_details{

	/*
	 * private int distance; private int fuel;
	 * 
	 * public int getDistance() { return distance; }
	 * 
	 * public void setDistance(int distance) { this.distance = distance; }
	 * 
	 * public int getFuel() { return fuel; }
	 * 
	 * public void setFuel(int fuel) { this.fuel = fuel; }
	 */
	
	public void disFuelEfficiency() {
		System.out.println("car efficiency is "+result+"km for liter");
	}
}
class Bike extends Vehicle_details
{
	public void disFuelEfficiency() {
		System.out.println("Bike efficiency is "+result+"km for liter");
	}
}
class Truck extends Vehicle_details{
	
	public void disFuelEfficiency() {
		System.out.println("Truck efficiency is "+result+"km for liter");
	}
}
class Vehicle1{
	void details(Vehicle_details ref) {
		ref.acceptInput();
		ref.calcFuelEfficiency();
		ref.disFuelEfficiency();
	}
}
public class Vehicle_System {

	public static void main(String[] args) {
		System.out.println("---------Car details-----------------");
		Car c=new Car();
		Bike b=new Bike();
		Truck t=new Truck();
		/*
		c.acceptInput();
		c.calcFuelEfficiency();
		c.disFuelEfficiency();
		
	
		b.acceptInput();
		b.calcFuelEfficiency();
		b.disFuelEfficiency();
		
		t.acceptInput();
		t.calcFuelEfficiency();
		t.disFuelEfficiency();
		*/
		/*
		Vehicle_details v;
		v=c;
		v.acceptInput();
		v.calcFuelEfficiency();
		v.disFuelEfficiency();
		
		v=b;
		v.acceptInput();
		v.calcFuelEfficiency();
		v.disFuelEfficiency();
		
		v=t;
		v.acceptInput();
		v.calcFuelEfficiency();
		v.disFuelEfficiency();
		*/
		Vehicle1 v=new Vehicle1();
		v.details(c);
		System.out.println("---------Bike details-----------------");
		v.details(b);
		System.out.println("---------Truck details-----------------");
		v.details(t);
	}

}
