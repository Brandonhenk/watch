package edu.jalc.watch;

public class RolexWatchBuilder implements WatchBuilderInterface {
	
	private String rubberBand;
	private String metalBand;
	private String digitalFace;
	private String analogFace;
	
	

	public RolexWatchBuilder() {
		super();
		this.rubberBand = null;
		this.metalBand = null;
		this.digitalFace = null;
		this.analogFace = null;
	}

	public RolexWatchBuilder(String rubberBand, String metalBand, String digitalFace, String analogFace) {
		super();
		this.rubberBand = rubberBand;
		this.metalBand = metalBand;
		this.digitalFace = digitalFace;
		this.analogFace = analogFace;
	}

	@Override
	public RolexWatchBuilder usesRubberBand(String rubberBand) {
		this.rubberBand = rubberBand;
		return this;
	}

	@Override
	public RolexWatchBuilder usesMetalBand(String metalBand) {
		this.metalBand = metalBand;
		return this;
	}

	@Override
	public RolexWatchBuilder hasDigitalFace(String digitalFace) {
		this.digitalFace = digitalFace;
		return this;
	}

	@Override
	public RolexWatchBuilder hasAnalogFace(String analogFace) {
		this.analogFace = analogFace;
		return this;
	}

	@Override
	public RolexWatch getRolexWatch() {
		return new RolexWatch(rubberBand, metalBand, digitalFace, analogFace);
	}

}
