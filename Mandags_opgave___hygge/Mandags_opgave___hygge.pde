int lightOn;


int x;
int y;


void setup(){
 size(400,400);
 background(255);
 ellipseMode(CENTER);
 x = width/2;
 y = height/2;
   
}

void draw(){
 if(keyPressed){
   if(key == 't'){
    background(255);
    stroke(255);
    fill(255,255,0);
    ellipse(x-300,y,200,200);
     } else {
       if(key == 's'){
        background(0);
        stroke(0);
        fill(0,100,255);
        ellipse(x-300,y,200,200);
       
       }
     }
   }
   if(keyPressed){
     if(keyCode == DOWN){
       ellipse(x-300,y,200,200);
       y = y + 1;
     } else {
       if(keyCode == UP){
         ellipse(x-300,y,200,200);
         y = y - 1;
       }
     }
   }
   
      if(keyPressed){
     if(keyCode == RIGHT){
       ellipse(x-300,y,200,200);
       x = x + 1;
     } else {
       if(keyCode == LEFT){
         ellipse(x-300,y,200,200);
         x = x - 1;
       }
     }
   }
}
