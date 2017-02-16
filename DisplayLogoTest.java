package edu.jalc.watch.display;

public class DisplayLogoTest{
  public void testDisplayLogo(){
    System.out.println("Testing DisplayLogo:: getDisplayLogo");
    DisplayLogo displaylogo = new DisplayLogo("Fossil");
    assert(displaylogo.getDisplayLogo() == "Fossil");
  }

  public static void main(String[] args){
    DisplayLogoTest displaylogotest = new DisplayLogoTest();
    displaylogotest.testDisplayLogo();
    System.out.println("DisplayLogoTest Complete");
  }
}
