package OOPzadania.Ex1;

public class Point3d extends Point2d{
    private float z;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float[] getXYZ(){
        return new float[] {x, y, z};
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y , z );
    }
}
