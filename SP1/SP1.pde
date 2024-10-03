ArrayList<Square> mySquares = new ArrayList<Square>();

void setup() {
  size(400, 400);
  background(255);
  
  for (int i = 0; i < 5; i++) {
    mySquares.add(new Square((int)random(10, 50)));
  }
}

void draw() {
  background(255);
  for (Square s : mySquares) {
    s.render();
  }
}

void keyPressed() {
  if (key == 'q' || key == 'Q') {
    mySquares.add(new Square((int)random(10, 50)));
  }
  if (key == 'W' || key == 'w') {
    mySquares.add(new Square((int)random(10, 50)));
    mySquares.add(new Square((int)random(10, 50)));
    mySquares.add(new Square((int)random(10, 50)));
    mySquares.add(new Square((int)random(10, 50)));
    mySquares.add(new Square((int)random(10, 50)));
  }
}
