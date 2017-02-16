package edu.jalc.watch.material;

public class MaterialTypeTest{

  public void testGetMaterialType(){
    System.out.println("Testing MaterialType:: getMaterialType");
    MaterialType materialtype = new MaterialType("metal");
    assert(materialtype.getMaterialType() == "metal");
  }

  public static void main(String[] args){
    MaterialTypeTest materialtypetest = new MaterialTypeTest();
    materialtypetest.testGetMaterialType();
    System.out.println("MaterialTypeTest Complete");
  }
}
