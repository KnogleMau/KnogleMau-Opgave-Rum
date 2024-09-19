boolean happy = true;




String inputText = "hello";
String upperText;
 
 boolean isUppercase;
 
 
 
 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }



// Task 2.3
upperText = toUpperCase(inputText);
println(upperText);


// task 2.4

isUppercase = isFirstUpperCase(inputText);


}

boolean iAmHappy(){
  // fill out what is missing here: 
  return false;
}

    
 int sum(int num1, int num2){
   int result = num1 + num2;
   
   return result;
   
 }
 
String toUpperCase(String inputText) {
  return input.toUpperCase();  
}

boolean isFirstLetterUpperCase(String input){
  input = inputText;
 if(input.length() > 0) {
   char firstChar = input.charAt(0);
   return Character.isUpperCase(firstChar);
 }
 return false;
}
