
import java.util.ArrayList; 


public class Main{

public static void main(String[] args){

ArrayList<String> actions = new ArrayList<String>();

actions.add("Start game");
actions.add("Resme game");
actions.add("Pause game");
actions.add("End game");
GameMenu menu = new GameMenu(actions);
//System.out.print(actions.get(2));
menu.displayMenu();
String userChoise = menu.getActions();
doAction(Integer.parseInt(userChoise),actions);
}


//5.d  

public static void doAction(Integer action, ArrayList<String>choices){

action=action-1;
String chosenAction = choices.get(action);
  System.out.println(chosenAction); 
     // String input = scan.nextLine();
 
//5.f
switch(action){
   // case statements
   // values must be of same type of expression
   case 0:
   	System.out.println("Starting the game now");
 
      break;
   case 1:
   	System.out.println("Fetching previously saved game data");
 
      break;
    case 2:
   	System.out.println("Game paused");
 
      break;
    case 3:
   	System.out.println("Ending game");
   	 
      break;  

     }
}


}
      