package edu.jalc.watch;

import edu.jalc.watch.Watch;
import edu.jalc.watch.display.Display;
import edu.jalc.watch.display.DisplayLogo;
import edu.jalc.watch.display.DisplayType;
import edu.jalc.watch.material.Material;
import edu.jalc.watch.material.MaterialColor;
import edu.jalc.watch.material.MaterialType;

public class WatchTest{

  public void testGetTime(){
    System.out.println("Testing Watch:: getTime");
    Watch watch = new Watch(1.0,null,null);
    assert(watch.getTime() == 1.0);
  }

  public void testGetDisplay(){
    System.out.println("Testing Watch:: getDisplay");
    DisplayLogo displaylogo = new DisplayLogo("Fossil");
    DisplayType displaytype = new DisplayType("analog");
    Display display = new Display(displaylogo,displaytype);
    Watch watch = new Watch(2.0,display,null);
    assert(watch.getDisplay() == display);
  }

  public void testGetMaterial(){
    System.out.println("Testing Watch:: getMaterial");
    MaterialType materialtype = new MaterialType("metal");
    MaterialColor materialcolor = new MaterialColor("black");
    Material material = new Material(materialtype,materialcolor);
    Watch watch = new Watch(2.0,null,material);
    assert(watch.getMaterial() == material);
  }
  public static void main(String[] args){
    WatchTest watchtest = new WatchTest();
    watchtest.testGetTime();
    watchtest.testGetDisplay();
    watchtest.testGetMaterial();
    System.out.println("WatchTest Complete");
  }

}
