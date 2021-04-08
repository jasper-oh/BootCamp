package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		
		Child ch = new Child();
		
		String newThang = ch.pStr;
		System.out.println("Which class did you came from ?");
		System.out.println(newThang);
		System.out.println("Father's name");
		ch.getFather();
		System.out.println("Mother's name");
		ch.getMother();

	}

}
