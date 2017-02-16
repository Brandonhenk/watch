package edu.jalc.watch.display;

public class Display{
  private DisplayLogo displaylogo;
  private DisplayType displaytype;

  public Display(DisplayLogo displaylogo, DisplayType displaytype){
    this.setDisplayLogo(displaylogo);
    this.setDisplayType(displaytype);
  }

  public DisplayLogo getDisplayLogo(){ return this.displaylogo;}

  public DisplayType getDisplayType(){ return this.displaytype;}

  DisplayType setDisplayType(DisplayType displaytype){
    this.displaytype = displaytype;
    return this.displaytype;
  }

  DisplayLogo setDisplayLogo(DisplayLogo displaylogo){
    this.displaylogo = displaylogo;
    return this.displaylogo;
  }
}
