int[] arr = {28, 230, 9, 310, 72};



void setup(){
  
  int randomElement = getRandom();
  println("random number " + randomElement); 
  
  
}


int getRandom(){
  
  int randomIndex = int(random(arr.length));
  return arr[randomIndex];
}
