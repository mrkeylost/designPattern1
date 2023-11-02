package factory;

import model.Bake;
import model.CupcakeBake;
import model.TartBake;

public class Factory {

	public Factory() {
		
	}
	
	public Bake createBakery(String type, String name, String softness, String top1, String top2, 
			String top3, String payment, float price) {
		
		if(type.equals("Cupcake")) {
			return new CupcakeBake(type, name, softness, top1, top2, top3, payment, price);
		} else if(type.equals("Tart")) {
			return new TartBake(type, name, softness, top1, top2, top3, payment, price);
		}
		return null;
	}

}
