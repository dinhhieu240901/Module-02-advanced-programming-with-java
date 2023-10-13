package com.codegym.baitap.Circle_Cylinder;

public class CircleManagement {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.0, "blue", 5.0);
        Cylinder cylinder2 = new Cylinder();

        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Cylinder 2: " + cylinder2);

        cylinder2.setHeight(7.0);

        System.out.println("Updated Cylinder 2: " + cylinder2);

        double volume1 = cylinder1.getVolume();
        System.out.println("Volume of Cylinder 1: " + volume1);

        double volume2 = cylinder2.getVolume();
        System.out.println("Volume of Cylinder 2: " + volume2);
    }
}
