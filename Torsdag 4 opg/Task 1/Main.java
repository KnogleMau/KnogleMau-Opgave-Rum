class Main{ 

//1.a Create a class Main with a main method.
 public static void main(String [] arg){          
//1.g From the main method in the Main class, create an instance of the Team class (instantiate the Team class).
  Team TeamA = new Team("Dream Team");
  Team TeamB = new Team("Taberne ");
  Team TeamC = new Team("De gode");    //1.k From the main method, create 5 more Team instances and print them.
  Team TeamD = new Team("Vinderne");
  Team TeamE = new Team("Ganlose");
  
 //1.i From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice. 

  TeamA.setRank(10);
  TeamB.setRank(6);
  TeamC.setRank(4);
  TeamD.setRank(9);
  TeamE.setRank(1); 

  System.out.println(TeamA.toString());
  System.out.println(TeamB.toString());
  System.out.println(TeamC.toString());
  System.out.println(TeamD.toString());
  System.out.println(TeamE.toString());

 }

}