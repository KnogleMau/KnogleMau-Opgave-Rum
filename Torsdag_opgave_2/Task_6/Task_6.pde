

void setup(){



divisible(10);

}


void divisible(int n){
 for(int i = 1; i <= 100; i++){
   if( i % n == 0){
     println(i);
  }
 }
}
