package edu.jalc.watch.display;

import edu.jalc.watch.interfaces.Notifiable;
import edu.jalc.watch.interfaces.Lightable;

public class Display implements Notifiable, Lightable{
  private DisplayLogo displaylogo;
  private DisplayType displaytype;

  private Display(){
    this.displaylogo = null;
    this.displaytype = null;
  }
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

  public void notified(int alarm){System.out.println("Set alarm to " + alarm + ":00");}

  public void light(){System.out.println("Light on");}

}
