package edu.jalc.watch.material;
import edu.jalc.watch.interfaces.Detachable;
import edu.jalc.watch.interfaces.Attachable;

public class Material implements Detachable, Attachable{

  private MaterialType materialtype;
  private MaterialColor materialcolor;

  private Material(){
    this.materialtype = null;
    this.materialcolor = null;
  }

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

  public void detach(){System.out.println("Detach watch");}

  public void attach(){System.out.println("Attach watch");}
  
}
