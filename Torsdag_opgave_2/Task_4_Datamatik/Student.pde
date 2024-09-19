class Student {
  
  String name;
  int age;
  String isFemale;
  String datamatikerTeam;
  
 
 
   Student(String tmpName, int tmpAge, String tmpIsFemale, String tmpDatamatikerTeam){
    
    name = tmpName;
    age = tmpAge;
    isFemale = tmpIsFemale;
    datamatikerTeam = tmpDatamatikerTeam;
    
      }

      void display(){
      println(name + age +" år " + "jeg er en" + isFemale + " og jeg går på " +datamatikerTeam);
  
      }



}  
    
