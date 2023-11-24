package ss4_module2.xay_dung_lop_fan;

public class Fan {
     public final static int SLOW = 1;
     public final static int MEDIUM = 2;
     public final  static int FAST = 3;

     private int speed = SLOW;
     private boolean on =  false;
     private double radius = 5;
     private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(on){
            return "Fan is on . Speed : "+ this.speed+ " color: "+ this.color + " Radius: " + this.radius;
        }else
            return "Fan is off . color :" + this.color + " radius: " + this.radius;
        }
    }
