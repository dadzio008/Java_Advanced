package OOPzadania.Ex3;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        this.color = "unknown";
        this.isFilled = false;
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double lenght) {
        super(color, isFilled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (float) (length * width);
    }

    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public String toString() {
        return "Rectangle with width= " + width + "and lenght= " + length + "which is a subclass off " + super.toString();
    }
}
