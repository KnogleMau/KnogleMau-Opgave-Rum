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

//5.a Create a method in the GameMenu class, getAction that prints the sentence "Type a number to choose an action" and then prints each elements in the options attribute.
// 5.c
public String getActions() { 
System.out.println( "Type a number to choose an action");

//5.b Next, in the getAction method, create a new Scanner object. Declare a variable String choice and assign it the user's input. (Similar to what you did in step 2.c and 2.d)
    Scanner scanner = new Scanner(System.in);
    String choise = "";
    choise = scanner.nextLine();

    //System.out.println(choise); 
    return choise;
   }
}