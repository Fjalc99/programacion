package ejemplo;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  LinkedList<Car> cars = new LinkedList<>();
		   Car ferrari = new Car("Ferrari 360 Spider");
		   Car bugatti = new Car("Bugatti Veyron");
		   Car lambo = new Car("Lamborghini Diablo");

		   cars.add(ferrari);
		   cars.add(bugatti);
		   cars.add(lambo);
		   System.out.println(cars.peekFirst());
		   System.out.println(cars.peekLast());
	}

}
