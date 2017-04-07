package edu.jalc.watch;

public class RolexWatchshop {

	public static void main(String[] args) {
		
		RolexWatch rWB = new RolexWatchBuilder().usesMetalBand("Rolex with metal band").hasAnalogFace("Rolex with Analog display").getRolexWatch();
		
		System.out.println(rWB);
	}

}
