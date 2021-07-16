package com.javalec.base;

public class SecondSon {
	
	//field
	
	//constructor
	
	//method
	public void takeChoco() {
		MamaBag mamaBag = new MamaBag();
		mamaBag.choco = mamaBag.choco -1;
		
		if(mamaBag.choco < 0) {
			System.out.println("Second Son need Choco");
		}else {
			System.out.println("Second Son already eat ! ");
		}
		}

}
