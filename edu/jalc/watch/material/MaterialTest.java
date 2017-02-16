package edu.jalc.watch.material;

public class MaterialTest{

  public void testGetMaterialType(){
    System.out.println("Testing Material:: getMaterialType");
    MaterialType materialtype = new MaterialType("type");
    Material material = new Material(materialtype, null);
    assert(material.getMaterialType() == materialtype);
  }

  public void testGetMaterialColor(){
    System.out.println("Testing Material:: getMaterialColor");
    MaterialColor materialcolor = new MaterialColor("color");
    Material material = new Material(null, materialcolor);
    assert(material.getMaterialColor() == materialcolor);
  }

  public static void main(String[] args){
    MaterialTest materialtest = new MaterialTest();
    materialtest.testGetMaterialType();
    materialtest.testGetMaterialColor();
    System.out.println("MaterialTest Complete");
  }
}
