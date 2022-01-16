/*interface
create an inteerface vehicle- mention maxage of vehicle, methods to set noofwheels
create class car and scooter and implements vehicle interface*/
package com.Assignment1;
interface vehicle{
	public static final int maxVeh = 0;
	void noOfWheels();
}
class car implements vehicle{
	
	
	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Car");
	}
}
class scooter implements vehicle{

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("Scooter");
	}
	
}
public class Inter {
	public static void main(String[] args) {
		car c1=new car();
		c1.noOfWheels();
		scooter s1=new scooter();
		s1.noOfWheels();
		System.out.println();
	}
}
