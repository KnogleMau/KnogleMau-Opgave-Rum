class Square{
 int h;

Square(int tmph){
    h = tmph;


    }
    

void render(){
 
 rect(random(width),random(height),h,h);
 fill(random(255),random(255),random(255));
 

}
}
