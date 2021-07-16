package com.javalec.base;

public class Franchise2 extends StoreHQ{

	
	@Override
	public void orderKim() {
		super.orderKim();
	
	}
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 4500원");
	}
	
	@Override
	public void orderBi() {
		System.out.println("비빔밥 4500원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 4500원");
	}
	
	@Override
	public void orderKong() {
		System.out.println("공기밥 free");
		
	}
}
