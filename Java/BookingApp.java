package msjava;

import java.util.*;

abstract class Ride{
	abstract void calculateFare(int distance);
	void rideType() {
		System.out.println("Generic Ride");
	}
}
class AutoRide extends Ride{
	void calculateFare(int distance) {
		System.out.println("Fare : ₹"+ distance*10);
		
	}
	void rideType() {
		System.out.println("Auto Ride");
	}
}

class CarRide extends Ride{
	void calculateFare(int distance) {
		System.out.println("Fare : ₹"+ distance*20);
		
	}
	void rideType() {
		System.out.println("Car Ride");
	}
}

public class BookingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ride type : auto / car \t");
		String ride=sc.next();
		
		System.out.print("Enter total distance: \t");
		int dist=sc.nextInt();
		
		AutoRide a=new AutoRide();
		CarRide c=new CarRide();
		
		if(ride.equalsIgnoreCase("car")) {
			c.rideType();
			c.calculateFare(dist);
		}
		else if(ride.equalsIgnoreCase("auto")) {
			a.rideType();
			a.calculateFare(dist);
		}
		else {
			System.out.println("Invalid input.");
		}
		
		
		sc.close();
	}

}
