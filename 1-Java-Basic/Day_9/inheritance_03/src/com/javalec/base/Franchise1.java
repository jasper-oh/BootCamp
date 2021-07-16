package com.javalec.base;

public class Franchise1 extends StoreHQ{

	
	@Override
	public void orderKim() {
		System.out.println("김치찌개 4500원");
	
	}
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 5000원");
	}
	
	@Override
	public void orderBi() {
		super.orderBi();
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 4000원");
	}
	
	@Override
	public void orderKong() {
		super.orderKong();
	}
}
