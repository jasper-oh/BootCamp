package com.javalec.base;

public class Main {
	public static void main(String[] args) {
		
		
										//static 이여서 바로 사용이 가능한거임! 
		LunchMenu child1 = new child1(PriceTable.RICE, PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.MILK,PriceTable.ALMOND);
		
		
		System.out.println("Child1's price : " + child1.calc());
	}

}
