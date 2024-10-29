package org.example;
// kom til og pull origin i git så skal lige sende den tilbage

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // System.out.println("hello world");
        JavaCSG csg = JavaCSGFactory.createDefault();
// Kryds og Bolle pladen
       Geometry3D line1 = csg.box3D(30,1,3,false);
       Geometry3D line2 = csg.box3D(30,1,3,false);
       Geometry3D line3 = csg.box3D(30,1,3,false);
       Geometry3D line4 = csg.box3D(30,1,3,false);
       Geometry3D bund = csg.box3D(30,30,1,false);

       line1 = csg.translate3D(0,5,0).transform(line1);
       line1 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90)).transform(line1);

       line2 = csg.translate3D(0,-5,0).transform(line2);
       line2 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90) ).transform(line2);

       line3 = csg.translate3D(0,5,0).transform(line3);

       line4 = csg.translate3D(0,-5,0).transform(line4);

// Kryds og Bolle figurer

       Geometry3D bolle1 = csg.flatRing3D(4,8,1,256,false);
       Geometry3D bolle2 = csg.flatRing3D(4,8,1,256,false);
       Geometry3D bolle3 = csg.flatRing3D(4,8,1,256,false);
       Geometry3D bolle4 = csg.flatRing3D(4,8,1,256,false);
       Geometry3D bolle5 = csg.flatRing3D(4,8,1,256,false);

       Geometry3D kryds1 = csg.box3D(8,1,1,false);
       Geometry3D kryds2 = csg.box3D(8,1,1,false);
       Geometry3D kryds3 = csg.box3D(8,1,1,false);
       Geometry3D kryds4 = csg.box3D(8,1,1,false);
       Geometry3D kryds5 = csg.box3D(8,1,1,false);
       Geometry3D kryds6 = csg.box3D(8,1,1,false);
       Geometry3D kryds7 = csg.box3D(8,1,1,false);
       Geometry3D kryds8 = csg.box3D(8,1,1,false);
       Geometry3D kryds9 = csg.box3D(8,1,1,false);
       Geometry3D kryds10 = csg.box3D(8,1,1,false);

       bolle1 = csg.translate3D(25,-25,0).transform(bolle1);
       bolle2 = csg.translate3D(25,-10,0).transform(bolle2);
       bolle3 = csg.translate3D(25,5,0).transform(bolle3);
       bolle4 = csg.translate3D(25,20,0).transform(bolle4);
       bolle5 = csg.translate3D(0,22,0).transform(bolle5);

       kryds1 = csg.translate3D(-25,20,0).transform(kryds1);
       kryds2 = csg.translate3D(20,25,0).transform(kryds2);
       kryds2 = csg.rotate3D(csg.degrees(0),csg.degrees(0),csg.degrees(90)).transform(kryds2);

       kryds3 = csg.translate3D(-25,5,0).transform(kryds3);
       kryds4 = csg.translate3D(5,25,0).transform(kryds4);
       kryds4 = csg.rotate3D(csg.degrees(0),csg.degrees(0),csg.degrees(90)).transform(kryds4);

       kryds5 = csg.translate3D(-25,-25,0).transform(kryds5);
       kryds6 = csg.translate3D(-25,25,0).transform(kryds6);
       kryds6 = csg.rotate3D(csg.degrees(0), csg.degrees(0), csg.degrees(90)).transform(kryds6);

       kryds7 = csg.translate3D(-25,-10,0).transform(kryds7);
       kryds8 = csg.translate3D(-10,25,0).transform(kryds8);
       kryds8 = csg.rotate3D(csg.degrees(0),csg.degrees(0),csg.degrees(90)).transform(kryds8);

       kryds9 = csg.translate3D(0,-25,0).transform(kryds9);
       kryds10 = csg.translate3D(-25,0,0).transform(kryds10);
       kryds10 = csg.rotate3D(csg.degrees(0),csg.degrees(0),csg.degrees(90)).transform(kryds10);

       Geometry3D bolle = csg.union3D(bolle1, bolle2, bolle3, bolle4,bolle5);
       Geometry3D kryds = csg.union3D(kryds1, kryds2, kryds3, kryds4, kryds5, kryds6, kryds7, kryds8, kryds9, kryds10);


       Geometry3D vert = csg.union3D(line1, line2, line3, line4,bund,bolle,kryds);



       csg.view(vert);


    }
}