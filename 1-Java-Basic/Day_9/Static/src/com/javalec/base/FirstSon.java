package com.javalec.base;

public class FirstSon {

	// field
		
	
	// constructor
	public FirstSon() {
	
	}
	
	// method
	
	public void takeChoco() {
	MamaBag mamaBag = new MamaBag();
	mamaBag.choco = mamaBag.choco -1;
	
	if(mamaBag.choco < 0) {
		System.out.println("First Son need Choco");
	}else {
		System.out.println("First Son already eat ! ");
	}
	}
	
}
