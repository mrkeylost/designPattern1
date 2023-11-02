package adapter;

import payment.Cash;
import payment.Crypto;

public class CryptoAdapter extends Cash{
	
	Crypto crypto;
	
	public CryptoAdapter(Crypto crypto) {
		super();
		this.crypto = crypto;
	}
	
	public String getPrice() {
		return crypto.getPrice();
	}

}
