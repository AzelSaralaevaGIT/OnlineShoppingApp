/***
 * 
 * 
 * 
 * Azel Saralaeva
 * 
 * 18014332
 * 
 * COMP503
 * 
 * Assessment A
 * 
 * 
 **/

public class OnlineShop {
	// declare private instance variables to ensure encapsulation
	// instance variable a primitive array of 5 product objects
	private static int SIZE = 5;
	private int nProduct;
	private Product[] inventory;

	// default constructor which initializes the inventory and sets nProduct to zero
	public OnlineShop() {
		this.inventory = new Product[SIZE];
		this.nProduct = 0;
	}

	// add method that sets inventory[nProduct] to an input Product object.
	// Increments nProduct as long as it doesn't exceed length of inventory
	public void addProduct(Product product) {
		if (nProduct <= 5)
			for (int i = 0; i < this.inventory.length; i++) {
				this.inventory[nProduct] = product;
			}
		nProduct++;

	}

	// get method which takes an integer between 1 and 5 and returns corresponding
	// product, otherwise null is returned
	public Product getProduct(int nProduct) {
		if (nProduct >= 0 && nProduct < 5) {
			return inventory[nProduct];
		} else {
			return null;
		}
	}

	public String toString() // returns and enumerates inventory contents using iteration to output each
								// product's toString on a new line
	{
		String productString = "";
		for (int i = 0; i < this.nProduct; i++) {
			productString += ((i + 1) + ". " + getProduct(i) + "\n");
		}
		return productString;
	}

}
