package ss6_module2.lop_point2D_ponint3D;

public class Point3D extends Point2D {
    public float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void Point3D(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arrayOf = {super.x,super.y,z};
        return arrayOf;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+ "Z :" +
                this.z;
    }
}
