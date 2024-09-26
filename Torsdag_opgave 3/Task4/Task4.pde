





void setup(){
size(400,400);
Square[] mySquares= new Square[30];
mySquares[0] = new Square(30);
for (Square s : mySquares){
s = new Square(44);
s.render();
}



}
