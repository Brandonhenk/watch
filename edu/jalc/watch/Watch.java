package edu.jalc.watch;

import edu.jalc.watch.display.Display;
import edu.jalc.watch.display.DisplayLogo;
import edu.jalc.watch.display.DisplayType;
import edu.jalc.watch.material.Material;
import edu.jalc.watch.material.MaterialType;
import edu.jalc.watch.material.MaterialColor;
import edu.jalc.watch.interfaces.Settable;
import edu.jalc.watch.interfaces.Trackable;

class Watch implements Settable, Trackable{

  private final double time;
  private Display display;
  private Material material;

  private Watch(){
    this.time = 2.0;
    this.display = null;
    this.material = null;
  }

  public Watch(double time, Display display, Material material){
    this.time = time;
    this.setDisplay(display);
    this.setMaterial(material);
  }

  public double getTime(){
    return this.time;
  }

  public Display getDisplay(){
    return this.display;
  }

  public Material getMaterial(){
    return this.material;
  }

  Display setDisplay(Display display){
    this.display = display;
    return this.display;
  }
  Material setMaterial(Material material){
    this.material = material;
    return this.material;
  }

  public void set(int time){System.out.println("Set time to " + time + ":00");}

  public void track(){System.out.println("Start stopwatch");}
  
}
