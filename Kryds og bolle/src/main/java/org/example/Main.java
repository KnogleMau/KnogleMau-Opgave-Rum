package org.example;


import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // System.out.println("hello world");
        JavaCSG csg = JavaCSGFactory.createDefault();

       Geometry3D line1 = csg.box3D(30,1,3,false);
       Geometry3D line2 = csg.box3D(30,1,3,false);
       Geometry3D line3 = csg.box3D(30,1,3,false);
       Geometry3D line4 = csg.box3D(30,1,3,false);
       Geometry3D bund = csg.box3D(30,30,1,false);
       Geometry3D bolle = csg.flatRing3D(4,8,1,256,false);
       Geometry3D kryds1 = csg.box3D(8,1,1,false);
       Geometry3D kryds2 = csg.box3D(8,1,1,false);


       line1 = csg.translate3D(0,5,0).transform(line1);
       line1 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90)).transform(line1);

       line2 = csg.translate3D(0,-5,0).transform(line2);
       line2 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90) ).transform(line2);

       line3 = csg.translate3D(0,5,0).transform(line3);

       line4 = csg.translate3D(0,-5,0).transform(line4);
       bolle = csg.translate3D(25,25,0).transform(bolle);

       kryds1 = csg.translate3D(-25,25,0).transform(kryds1);

       kryds2 = csg.translate3D(25,25,0).transform(kryds2);
       kryds2 = csg.rotate3D(csg.degrees(0),csg.degrees(0),csg.degrees(90)).transform(kryds2);

       Geometry3D kryds = csg.union3D(kryds1, kryds2);

       Geometry3D vert = csg.union3D(line1, line2, line3, line4,bund, bolle,kryds);



       csg.view(vert);


    }
}