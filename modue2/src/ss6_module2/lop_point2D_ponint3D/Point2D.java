package ss6_module2.lop_point2D_ponint3D;

public class Point2D {
    public float x;
    public float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arrayOf = {x,y};
        return arrayOf;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x :" + this.x +"\n"+
                ", y=" + this.y +
                '}';
    }
}
