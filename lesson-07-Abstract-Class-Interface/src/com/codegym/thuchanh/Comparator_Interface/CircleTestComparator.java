package com.codegym.thuchanh.Comparator_Interface;

import com.codegym.baitap.Comparable_Interface.Circle;

import java.util.ArrayList;

import java.util.List;

public class CircleTestComparator {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(1.5);
        Circle c3 = new Circle(2.0);

        CircleComparator circleComparator = new CircleComparator();
        List<Circle> circles = new ArrayList<>();
        circles.add(c1);
        circles.add(c2);
        circles.add(c3);
        circles.sort(circleComparator);
        System.out.println("Danh sách các Circle sau khi sắp xếp:");
        for (Circle circle : circles) {
            System.out.println("Bán kính: " + circle.getRadius());
        }
    }

}
