package br.com.mariojp.solid.ocp;

public class PatherDiscount implements Discount {
	private  CustomerType type;
	
	public PatherDiscount() {
		
		this.type = type.PARTNER;
		
	}
	public double apply (double amount) {
		return amount * 0.88;
	}
	
}