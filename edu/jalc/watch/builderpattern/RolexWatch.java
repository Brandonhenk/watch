package edu.jalc.watch.builderpattern;

public class RolexWatch{
	private String rubberBand;
	private String metalBand;
	private String digitalFace;
	private String analogFace;
	
	private RolexWatch() {
		super();
		this.rubberBand = null;
		this.metalBand = null;
		this.digitalFace = null;
		this.analogFace = null;
	}

	public RolexWatch(String rubberBand, String metalBand, String digitalFace, String analogFace) {
		super();
		this.rubberBand = rubberBand;
		this.metalBand = metalBand;
		this.digitalFace = digitalFace;
		this.analogFace = analogFace;
	}

	@Override
	public String toString() {
		return "RolexWatch [rubberBand=" + rubberBand + ", metalBand=" + metalBand + ", digitalFace=" + digitalFace
				+ ", analogFace=" + analogFace + "]";
	}
	
	
	
	
	
}
