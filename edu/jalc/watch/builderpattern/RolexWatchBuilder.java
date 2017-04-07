package edu.jalc.watch.builderpattern;

public class RolexWatchBuilder implements WatchBuilderInterface {
	
	private String rubberBand;
	private String metalBand;
	private String digitalFace;
	private String analogFace;
	
	

	public RolexWatchBuilder() {
		this.rubberBand = null;
		this.metalBand = null;
		this.digitalFace = null;
		this.analogFace = null;
	}

	@Override
	public RolexWatchBuilder usesRubberBand() {
		this.rubberBand = "High end rubber band";
		return this;
	}

	@Override
	public RolexWatchBuilder usesMetalBand() {
		this.metalBand = "High end metal band";
		return this;
	}

	@Override
	public RolexWatchBuilder hasDigitalFace() {
		this.digitalFace = "Has digial face";
		return this;
	}

	@Override
	public RolexWatchBuilder hasAnalogFace() {
		this.analogFace = "Has analog face";
		return this;
	}

	@Override
	public RolexWatch build() {
		return new RolexWatch(rubberBand, metalBand, digitalFace, analogFace);
	}

}
