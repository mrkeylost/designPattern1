package adapter;

import payment.Cash;
import payment.Transfer;

public class TransferAdapter extends Cash{

	Transfer transfer;
	
	public TransferAdapter(Transfer transfer) {
		super();
		this.transfer = transfer;
	}
	
	public String getPrice() {
		return transfer.getPrice();
	}
}
