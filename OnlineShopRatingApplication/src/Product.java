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

public class Product {
	// declare private instance variables for the product class
	private String modelName = "";
	private String manufacturerName = "";
	private double retailPrice = 0.0;
	private double reliabilityRating = 0.0;
	private int numConsumerRatings = 0;

	// first constructor that takes in model name, manufacturer name and retail
	// price as parameters
	public Product(String modelName, String manufacturerName, double retailPrice) {
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.retailPrice = retailPrice;
		this.reliabilityRating = 0.0;
		this.numConsumerRatings = 0;
	}

	// second constructor that takes in model name and manufacturer name
	public Product(String modelName, String manufacturerName) {
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.retailPrice = 0.0;
		this.reliabilityRating = 0.0;
		this.numConsumerRatings = 0;
	}

	// default constructor
	public Product() {
		this.modelName = "UNKNOWN";
		this.manufacturerName = "UNKNOWN";
		this.retailPrice = 0.0;
		this.reliabilityRating = 0.0;
		this.numConsumerRatings = 0;

	}

	// get method for model name returns model name
	public String getmodelName() {
		return this.modelName;
	}

	// get method for manufacturer name returns manufacturer name
	public String getmanufacturerName() {
		return this.manufacturerName;
	}

	// get method for retail price returning retail price
	public double getretailPrice() {
		return this.retailPrice;
	}

	// set method for retail price with double parameter
	public void setretailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	// get method for reliability rating returning reliability rating
	public double getreliabilityRating() {
		return this.reliabilityRating;
	}

	// get method for consumer ratings returning number of consumer ratings
	public int getconsumerRatings() {
		return this.numConsumerRatings;
	}

	// method that computes average of the reliability rating by all customers who
	// rated this product when called upon, updates 0 to current rating
	public void rateReliability(double newRating) {
		reliabilityRating = ((this.reliabilityRating * this.numConsumerRatings) + (newRating))
				/ (this.numConsumerRatings + 1);
		this.numConsumerRatings++;

	}

	// Override the toString() method to return a description of the product that
	// has manufacturer name, model name, retail price, reliability rating and
	// consumer ratings
	@Override
	public String toString() {
		return "Model Name: " + this.modelName + ", Manufacturer Name: " + this.manufacturerName + ", Retail Price: $"
				+ this.retailPrice + ", Reliability Rating: " + this.getreliabilityRating() + ", Consumer Rating: "
				+ this.numConsumerRatings;
	}

}
