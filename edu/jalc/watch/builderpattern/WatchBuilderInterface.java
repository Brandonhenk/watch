package edu.jalc.watch.builderpattern;

public interface WatchBuilderInterface {
	
	public WatchBuilderInterface usesRubberBand();
	
	public WatchBuilderInterface usesMetalBand();
	
	public WatchBuilderInterface hasDigitalFace();
	
	public WatchBuilderInterface hasAnalogFace();
	
	public RolexWatch build();
	
}
