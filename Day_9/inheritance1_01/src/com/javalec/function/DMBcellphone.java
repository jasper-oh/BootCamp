package com.javalec.function;

public class DMBcellphone extends CellPhone {
	
	
	
// Field 
	public int channel;
	
	
	
// Constructor
	public DMBcellphone(String model, String color, int channel) {
//		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	
	
// Method
	public void turnOnDmb() {
		System.out.println("Channel" + channel + "번 DMB방송 수신을 시작합니다.");
		
	}
	
	// Current field announce keyword => <this>
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Channel" + channel + "changed");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 수신을 멈춥니다. ");
	}
}
