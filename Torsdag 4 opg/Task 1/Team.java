
//1.b Create an entity class called Team.
class Team{

 	private String teamName;  // 1.c Add a private instance variable a.k.a attribute to Team to hold the team name.
    private Integer teamsRank;    // 1.d Add another private instance variable to hold the Teams rank (some number).    
    private String playersNames; // 1.e Add yet another private instance variable to hold the names of players in the team.

//1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name. Make sure the parameter value is assigned to the mathcing instance variable.	
public Team(String teamName) {
   this.teamName=teamName; 
    }

//1.h From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice.
public void setRank(Integer rank){
   this.teamsRank=rank; 
}


public String toString(){
        String s = "hold: "+ this.teamName + " Rank: " + this.teamsRank  ;

        return s;
    }
}