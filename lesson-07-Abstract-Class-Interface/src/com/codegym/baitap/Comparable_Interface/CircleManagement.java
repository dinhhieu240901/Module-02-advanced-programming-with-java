package com.codegym.baitap.Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircleManagement {
    public static void main(String[] args) {
        List<Comparable> circles = new ArrayList<>();
        circles.add(new Comparable(3.0));
        circles.add(new Comparable(1.5));
        circles.add(new Comparable(2.0));

        int i = 0;
        System.out.print("Bán kính: ");
        for (Comparable circle : circles) {
            System.out.print(circle.getRadius());
            if (i < circles.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }

        Collections.sort(circles);

        System.out.println("\nDanh sách các Circle sau khi đã sắp xếp:");
        i = 0;
        System.out.print("Bán kính: ");

        for (Comparable circle : circles) {
            System.out.print(circle.getRadius());
            if (i < circles.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
