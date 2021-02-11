package OOPzadania.Ex1;

public class Point2d {
    float x;
    float y;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)" , x , y);
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;

    }
}
