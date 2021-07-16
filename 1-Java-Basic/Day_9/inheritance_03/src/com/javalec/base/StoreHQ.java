package com.javalec.base;

public class StoreHQ {
	
	
	public int priceKim = 1000;
	public int priceBu = 1000;
	public int priceBi = 1000;
	public int priceSoon = 1000;
	public int priceKong = 1000;
	
	
	public StoreHQ() {
		
	}
	
	
	public void orderKim() {
		System.out.println("김치찌(HQ) : 10000원");
	}
	
	public void orderBu() {
		System.out.println("부대찌(HQ) : 10000원");

	}
	
	public void orderBi() {
		System.out.println("비빔(HQ) : 10000원");
	}
	
	public void orderSoon() {
		System.out.println("순대국(HQ) : 10000원");
	}
	
	public void orderKong() {
		System.out.println("공기밥(HQ) : 10000원");
	}
}
