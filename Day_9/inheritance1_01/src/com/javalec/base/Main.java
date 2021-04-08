package com.javalec.base;

import com.javalec.function.DMBcellphone;

public class Main {
	
	public static void main(String[] args) {
		
		DMBcellphone dmb = new DMBcellphone("JAVA PHONE","BLACK",10);
		
		dmb.powerOn();
		dmb.ringBell();
		dmb.sendVoice("What's UUUUUUUUUUP");
		dmb.receiveVoice("What's UUUUUUUUUP DUUUUDE");
		dmb.sendVoice("Shut the f up");
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		dmb.powerOff();
	
	}
	
}
