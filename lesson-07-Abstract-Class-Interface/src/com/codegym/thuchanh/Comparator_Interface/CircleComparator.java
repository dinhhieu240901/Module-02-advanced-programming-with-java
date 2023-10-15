package com.codegym.thuchanh.Comparator_Interface;
import java.util.Comparator;

import com.codegym.baitap.Comparable_Interface.Circle;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }

}