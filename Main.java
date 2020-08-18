package refactorjava;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		int[] arr = {1,2,3,4,5};
		
		Movie fnf= new Movie("Fast and Furious", 2);
		Movie harryPotter = new Movie("Harry potter series", 1);
//		Movie pirates = new Movie("Pirates of the Carribean", 0);
//		Movie dark = new Movie("Dark - TV series", 45);

		Rental fnfRental = new Rental(fnf, 5);
		Rental harryPotterRental = new Rental(harryPotter, 5);
//		Rental piratesRental = new Rental(pirates, 5);
//		Rental darkRental = new Rental(dark, 5);
		
		Customer akash = new Customer("Akash");
		Customer navnath = new Customer("Navnath");
		
		akash.addRental(fnfRental);
		akash.addRental(harryPotterRental);
		
//		navnath.addRental(fnfRental);
		
		System.out.println(akash.statement());
		System.out.println(akash.htmlStatement());
	}

}
