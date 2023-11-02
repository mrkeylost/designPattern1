package singleton;

import java.util.Vector;

import adapter.CryptoAdapter;
import adapter.TransferAdapter;
import model.Bake;
import payment.Cash;
import payment.Crypto;
import payment.Transfer;

public class ViewAll {

	private static ViewAll instance;
	
	Vector<Bake> getBakeList;
	
	Cash cash;
	Transfer transfer;
	Crypto crypto;
	
	private ViewAll() {
		this.getBakeList = new Vector<>();
	}

	public Vector<Bake> getGetBakeList() {
		return getBakeList;
	}

	public void setGetBakeList(Vector<Bake> getBakeList) {
		this.getBakeList = getBakeList;
	}
	
	public void viewAll() {
		if(getBakeList.isEmpty()) {
			System.out.println("No confectionary yet...");
		} else {
			for (Bake bake : getBakeList) {
				System.out.println("Name : " + bake.getName() + " (" + bake.getType() + ")");
				System.out.println("Softness : " + bake.getSoftness());
				
				if(bake.getTop1() == null && bake.getTop2() == null && bake.getTop3() == null) {
					System.out.println("Topping : -");
				} else {
					System.out.println("Topping : " + bake.getTop1() + " " + bake.getTop2() + " " + bake.getTop3());
				}
				
				System.out.println("Payment : " + bake.getPayment());
				
				
				cash = new Cash(bake.getPrice());
				transfer = new Transfer(bake.getPrice());
				crypto = new Crypto(bake.getPrice());
				
				if(bake.getPayment().equals("Cash")) {
					System.out.println(getPayment(cash, bake.getPrice()));
				} else if(bake.getPayment().equals("Transfer")) {
					
					TransferAdapter transferAdapter = new TransferAdapter(transfer);
					
					System.out.println(getPayment(transferAdapter, bake.getPrice()));
					
				} else if(bake.getPayment().equals("Crypto")) {
					
					CryptoAdapter cryptoAdapter = new CryptoAdapter(crypto);
					
					System.out.println(getPayment(cryptoAdapter, bake.getPrice()));
					
				}
				
				System.out.println("======================================================================");
				System.out.println();
			}
		}
	}
	
	public String getPayment(Cash cash, float price) {
		
		return cash.getPrice();
		
	}
	
	public static synchronized ViewAll getInstance() {
		if(instance == null) {
			return new ViewAll();
		}
		
		return instance;
	}

}
