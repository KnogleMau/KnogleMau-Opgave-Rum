package org.example;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Kryds {
    JavaCSG csg = JavaCSGFactory.createDefault();

    private  double  x;
    private double y;
    private double z;
    private Geometry3D shape;

    public Kryds(int xSize, int ySize, int zSize){
        Geometry3D kryds1 = csg.box3D(xSize, ySize, zSize, false);
        Geometry3D kryds2 = csg.box3D(xSize, ySize, zSize, false);
        kryds2 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90)).transform(kryds2);
        this.shape = csg.union3D(kryds1, kryds2);
        this.shape = csg.translate3D(25,25,1).transform(this.shape);
    }
/*
    public void krydsMove(double x, double y, double z, this.shape){
       this.shape = csg.translate3D(this.x,this.y,this.z).transform(this.shape);
    }
    */
    public void krydsView(){
        csg.view(this.shape);
    }

}
