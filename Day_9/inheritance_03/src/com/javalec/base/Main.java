package com.javalec.base;

public class Main {
	
	public static void main(String[] args) {
		
		
//		Using Object to 
		
		StoreHQ[] store = { new Franchise1(), new Franchise2() };
		
		for(int i = 0 ; i < store.length ; i++) {
			System.out.println("=====shop"+(i+1)+"===="+"\n");
			
			
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
			
			System.out.println("");
			
		}
		
	}
	
}
