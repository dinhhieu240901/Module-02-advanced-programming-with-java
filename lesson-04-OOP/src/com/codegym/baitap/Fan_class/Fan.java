package com.codegym.baitap.Fan_class;

public class Fan {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (on) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        speed = 0;
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

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = true;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public Fan() {

    }

    @Override
    public String toString() {
        return "Fan{speed=" + speed + ", on=" + on + ", radius=" + radius + ", color='" + color + '\'' + '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
