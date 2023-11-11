package ss6_module2.lop_point_va_movablepoint;

public class MovablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return super.toString()+ "\n xSpeed = " + xSpeed +
                "\n ySpeed = " + ySpeed;
    }
   public void move(){
         super.setX(super.getX()+ this.xSpeed);
         super.setY(super.getY()+ this.ySpeed);
   }
}
