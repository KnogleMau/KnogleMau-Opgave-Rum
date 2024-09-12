int input;
int x =(int)random(5,15);
println(x);
if(x <= 10){
for(input = -20; input <=0; input++){
  
  println(input);
  
  if(input==-6){
    println("-six");
  } else if((int) input == -3){
    println("HALF");
    
    }
  
  }
}   else {


for(input = 20; input >=0; input--){
  
  println(input);
  
  if(input==6){
    println("six");
  } else if((int) input == 3){
    println("HALF");
    
    }
  
  }
}

// når du skal gøre det med -tal skal du ændre til værdien stiger med 1 så ++
// eller og intput er lavere eller = 0
