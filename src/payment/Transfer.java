package payment;

import java.util.Random;

public class Transfer {

	float price;
	
	public Transfer(float price) {
		this.price = price;
	}
	
	public String getPrice() {
		return "Price : " + price * 1.1 + " with address : " + generateAccount();
	}
	
	public long generateAccount() {
		
		Random rand = new Random();
		
		long random = (long)(rand.nextDouble()*10000000000L);
		
		return random;
		
	}

}
