package edu.jalc.watch.material;

public class MaterialColorTest{

  public void testGetMaterialColor(){
    System.out.println("Testing MaterialColor:: getMaterialColor");
    MaterialColor materialcolor = new MaterialColor("black");
    assert(materialcolor.getMaterialColor() == "black");
  }

  public static void main(String[] args){
    MaterialColorTest materialcolortest = new MaterialColorTest();
    materialcolortest.testGetMaterialColor();
    System.out.println("MaterialColorTest Complete");
  }
}
