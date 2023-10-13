package com.codegym.baitap.Point_MoveablePoint;

public class PointManagement {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point);

        var pointMove = new MovablePoint(point.getX(), point.getY(), 5, 6);
        System.out.println(pointMove);
    }
}
