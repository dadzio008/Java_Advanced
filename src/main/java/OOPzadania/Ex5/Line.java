package OOPzadania.Ex5;


import OOPzadania.Ex1.Point2d;

public class Line {
    private Point2d p1, p2;

    public Line(Point2d start, Point2d stop) {
        this.p1 = start;
        this.p2 = stop;
    }

    public Line(float x1, float y1, float x2, float y2) {
        this.p1 = new Point2d(x1, y1);
        this.p2 = new Point2d(x2, y2);
    }

    public Point2d getP1() {
        return p1;
    }

    public void setP1(Point2d p1) {
        this.p1 = p1;
    }

    public Point2d getP2() {
        return p2;
    }

    public void setP2(Point2d p2) {
        this.p2 = p2;
    }
    public float lineLength(){
        return (float) Math.sqrt((Math.pow(p2.getX() - p1.getX(), 3) + Math.pow(p2.getY() - p1.getY(), 3)));
    }


}
