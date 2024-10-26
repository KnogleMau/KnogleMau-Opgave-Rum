public class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r,2); //3.14 * r * r
    }


    @Override
    public void display() {

    }
}