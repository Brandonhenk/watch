package edu.jalc.watch.display;

public class DisplayTypeTest{
  public void testDisplayType(){
    System.out.println("Testing DisplayType:: getDisplayType");
    DisplayType displaytype = new DisplayType("analog");
    assert(displaytype.getType() == "analog");
  }

  public static void main(String[] args){
    DisplayTypeTest displaytypetest = new DisplayTypeTest();
    displaytypetest.testDisplayType();
    System.out.println("DisplayTypeTest Complete");
  }
}
