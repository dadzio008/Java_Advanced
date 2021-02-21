package OOPzadania.Ex3and4;

public class Circle extends Shape{
    float radiusattribute;

    public Circle() {
        this.isFilled = false;
        this.color = "unknown";
        this.radiusattribute = 1;
    }

    public Circle(String color, boolean isFilled, float radiusattribute) {
        super(color, isFilled);
        this.radiusattribute = radiusattribute;
    }

    public float getRadiusattribute() {
        return radiusattribute;
    }

    public void setRadiusattribute(float radiusattribute) {
        this.radiusattribute = radiusattribute;
    }

    @Override
    public double getArea(){
        return (float) (Math.PI * radiusattribute * radiusattribute);
    }

    @Override
    public double getPerimeter(){
        return (float) (2 * Math.PI * radiusattribute);
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radiusattribute + "which is a subclass off " + super.toString();
    }
}
