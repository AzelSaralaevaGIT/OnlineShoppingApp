
/***

 * 

 * Azel Saralaeva

 * 18014332

 * COMP503

 * Assessment A

 * 
 **/

import java.util.Scanner;

public class ShopApp {

	// declare private instance variable of type OnlineShop
	private static OnlineShop onlineShopA = new OnlineShop();
	static Scanner scan = new Scanner(System.in);

	private static void rateProduct() {
		System.out.println(onlineShopA);
		System.out.println("Is the current inventory we have!");
		int input = 0;
		while (input < 1 || input > 5) {
			System.out.println("Please enter a number between 1 and 5 in order to select a product: ");
			input = scan.nextInt();
		}

		System.out.println("New Product Rating: ");
		double rating = scan.nextDouble();
		while (rating < 0.0 || rating > 5.0) // invalid
		{
			System.out.println("Invalid input entered! Please try again.");
			rating = scan.nextDouble();
		}
		onlineShopA.getProduct(input - 1).rateReliability(rating);

		System.out.println("New Product Rating is: ");
		System.out.println(onlineShopA.getProduct(input - 1).getreliabilityRating());
	}

	// instantiate the OnlineShop and use the addProduct method created to populate
	// inventory
	public static void main(String[] args) {

		Product item1 = new Product("Sugar", "System2", 123.45);
		onlineShopA.addProduct(item1);

		Product item2 = new Product("Honey", "Systemthree", 93.20);
		onlineShopA.addProduct(item2);

		Product item3 = new Product("Yellow", "Greattheme", 33.55);
		onlineShopA.addProduct(item3);

		Product item4 = new Product("LaptopManu", "Mouse", 34.92);
		onlineShopA.addProduct(item4);

		Product item5 = new Product("Strawbs", "Robinhood", 85.72);
		onlineShopA.addProduct(item5);

		// Repeatedly presents the following menu, asking user to enter an option
		while (true) {
			// User interface for ShopApp
			System.out.println("Welcome! Enter an option out of the following menu:");
			System.out.println("A. Display inventory");
			System.out.println("B. Rate Product");
			System.out.println("C. Exit");
			System.out.println("--> ");
			char prompt = scan.next().charAt(0);

			{
				// if user enters A or a it will print the contents of the onlineShopA
				if (prompt == 'A' || prompt == 'a') {
					System.out.println(onlineShopA);
					System.out.println("Is the current inventory we have!");

				}

				// if user enters B or b it will invoke the rateProduct method
				else if (prompt == 'B' || prompt == 'b') {
					rateProduct();
				}

			}
			// if user enters C or c it will terminate the ShopApp
			if (prompt == 'C' || prompt == 'c') {
				System.exit(0);
			}

		}

	}

}
