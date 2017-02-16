package edu.jalc.watch.material;

public class Material{

  private MaterialType materialtype;
  private MaterialColor materialcolor;

  public Material(MaterialType materialtype, MaterialColor materialcolor){
    this.setMaterialType(materialtype);
    this.setMaterialColor(materialcolor);
  }

  public MaterialType getMaterialType(){
    return this.materialtype;
  }

  public MaterialColor getMaterialColor(){
    return this.materialcolor;
  }

  MaterialType setMaterialType(MaterialType materialtype){
    this.materialtype = materialtype;
    return this.materialtype;
  }

  MaterialColor setMaterialColor(MaterialColor materialcolor){
    this.materialcolor = materialcolor;
    return this.materialcolor;
  }
}
