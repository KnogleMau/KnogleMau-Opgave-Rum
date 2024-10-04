// 4.a Create an entity class, GameMenu.

import java.util.ArrayList;
import java.util.Scanner; 

public class GameMenu {

//4.b Add a private instance variable, actions of type ArrayList<String> to the class.
 
 private ArrayList<String> actions = new ArrayList<String>();

//4.c Add a constructor with a parameter of type ArrayList.
 public GameMenu(ArrayList<String> actions){
 	this.actions=actions; 
     }


 public void displayMenu(){

 	for(String s:actions){
      System.out.println(s);
 	
     }
  }	


}