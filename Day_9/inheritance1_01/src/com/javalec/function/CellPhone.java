package com.javalec.function;

public class CellPhone {
	
	// Field
	public String model;
	public String color;
	
	
	// Constructor
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void powerOn() {
		System.out.println("Power On");
	}
	
	public void powerOff() {
		System.out.println("Power Off");
	}
	
	public void ringBell() {
		System.out.println("Bells are ringing");
	}
	
	public void sendVoice(String message) {
		System.out.println("Me : " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("participants : " + message);
	}
	public void hangUp() {
		System.out.println("hang up the phone");
	}
	
}
