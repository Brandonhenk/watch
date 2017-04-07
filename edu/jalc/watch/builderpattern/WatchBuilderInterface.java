package edu.jalc.watch;

public interface WatchBuilderInterface {
	
	public RolexWatchBuilder usesRubberBand(String rubberBand);
	
	public RolexWatchBuilder usesMetalBand(String metalBand);
	
	public RolexWatchBuilder hasDigitalFace(String digialFace);
	
	public RolexWatchBuilder hasAnalogFace(String analogFace);
	
	public RolexWatch getRolexWatch();
	
}
