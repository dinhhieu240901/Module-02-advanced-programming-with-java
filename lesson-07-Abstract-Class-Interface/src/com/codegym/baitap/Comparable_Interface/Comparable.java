package com.codegym.baitap.Comparable_Interface;

public class Comparable extends Circle implements java.lang.Comparable<Comparable> {

    public Comparable(){}

    public Comparable(double radius) {
        super(radius);
    }

    public Comparable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Comparable o) {
//        if (getRadius() < o.getRadius()) {
//            return -1;
//        } else if (getRadius() > o.getRadius()) {
//            return 1;
//        } else {
//            return 0;
//        }
        return Double.compare(getRadius(), o.getRadius());

    }
}