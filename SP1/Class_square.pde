class Square {
  int size;
  float x, y;
  
  Square(int size) {
    this.size = size;
    this.x = random(width);
    this.y = random(height);
  }
  
  void render() {
    rect(x, y, size, size);
    fill(random(255),random(255),random(255));
  }
}
