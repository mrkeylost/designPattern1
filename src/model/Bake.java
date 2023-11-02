package model;

public abstract class Bake {

	protected String type, name, softness, top1, top2, top3, payment;
	protected float price;
	
	public Bake(String type, String name, String softness, String top1, String top2, String top3,
			String payment, float price) {
		super();
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.top1 = top1;
		this.top2 = top2;
		this.top3 = top3;
		this.payment = payment;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getSoftness() {
		return softness;
	}

	public String getTop1() {
		return top1;
	}

	public String getTop2() {
		return top2;
	}

	public String getTop3() {
		return top3;
	}

	public String getPayment() {
		return payment;
	}

	public float getPrice() {
		return price;
	}
	
	
}
