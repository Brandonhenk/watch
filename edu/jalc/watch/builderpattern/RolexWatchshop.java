package edu.jalc.watch.builderpattern;

public class RolexWatchshop {

	public static void main(String[] args) {
		
		RolexWatch rWB = new RolexWatchBuilder()
				.usesRubberBand()
				.hasAnalogFace().build();
		
		System.out.println(rWB);
	}

}
