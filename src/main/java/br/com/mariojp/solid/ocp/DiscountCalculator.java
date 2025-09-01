package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
	private final Map<CustomerType, Discount> discountType = new HashMap<>();
	
	public DiscountCalculator(){
		discountType.put(CustomerType.PARTNER, new PatherDiscount());
		discountType.put(CustomerType.PREMIUM, new PremiumDiscount());
		discountType.put(CustomerType.REGULAR, new RegularDiscount());
		
	}
	
    public double apply(double amount, CustomerType type){
     return discountType.getOrDefault(type, d -> d ).apply(amount);  
    	
    }
}