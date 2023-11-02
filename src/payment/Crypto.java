package payment;

import java.util.UUID;

public class Crypto {

	float price;
	
	public Crypto(float price) {
		this.price = price;
	}

	public String getPrice() {
		return "Price : " + price / 2 + " with account number : " + generateAddress(12);
	}
	
	public String generateAddress(int length) {
		
		String random = UUID.randomUUID().toString();
		
		return random;
		
		
	}
}
