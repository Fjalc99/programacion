package ejemplo;

import java.util.LinkedList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LinkedList<Car> cars = new LinkedList<>();
		   Car ferrari = new Car("Ferrari 360 Spider");
		   Car bugatti = new Car("Bugatti Veyron");
		   Car lambo = new Car("Lamborghini Diablo");

		   cars.add(ferrari);
		   cars.add(bugatti);
		   cars.add(lambo);
		  // System.out.println(cars.pollFirst());
		   //System.out.println(cars.pollLast());
		  
		   System.out.println(cars.removeFirstOccurrence(cars));
		   System.out.println ("What's on the list?");
		   System.out.println(cars);
	}

}
