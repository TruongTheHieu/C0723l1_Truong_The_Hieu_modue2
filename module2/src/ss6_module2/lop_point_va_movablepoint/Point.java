package ss6_module2.lop_point_va_movablepoint;

public class Point {
    public float x;
    public float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
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
    public void setXY(float x,float y){
        this.x =x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.x +
                ", y=" +this.y +
                '}';
    }
}
