class Teacher {
  
 String name;
 int age;
 String isFemale;
  
Teacher(String tmpName, int tmpAge, String tmpIsFemale){
   
        name = tmpName;
        age = tmpAge;
        isFemale = tmpIsFemale;
    
        }
  
        void display2(){
          println(name + age + " år, " + " og jeg er en " + isFemale);
  
          }
}
