import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes = new ArrayList<>();
    void addShape(Shape s){
        shapes.add(s);
    }
    double getTotalArea(){
        double total = 0.0;
        for (Shape s:shapes) {
            total += s.getArea();
        }
        return total;
    }


}
public void settings() {
    size(700, 900);
}
