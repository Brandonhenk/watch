package edu.jalc.watch.display;

public class DisplayTest{

  public void testGetDisplayLogo(){
    System.out.println("Testing Display:: getDisplayLogo");
    DisplayLogo displaylogo = new DisplayLogo("Fossil");
    Display display = new Display(displaylogo,null);
    assert(display.getDisplayLogo() == displaylogo);
  }
  public void testGetDisplayType(){
    System.out.println("Testing Display:: getDisplayType");
    DisplayType displaytype = new DisplayType("analog");
    Display display = new Display(null,displaytype);
    assert(display.getDisplayType() == displaytype);
  }
  public static void main(String[] args){
    DisplayTest displaytest = new DisplayTest();
    displaytest.testGetDisplayLogo();
    displaytest.testGetDisplayType();
    System.out.println("DisplayTest Complete");
  }
}
