package payment;

public class Cash {

	float price;
	
	public Cash(float price) {
		this.price = price;
	}

	public Cash() {
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return "Price : " + price * 1;
	}

}
