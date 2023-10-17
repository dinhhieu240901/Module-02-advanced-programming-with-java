package com.codegym.thuchanh.Mylist;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> myList = new Mylist<Integer>();


        myList.add(1);
        myList.add(2);

        myList.showList();

        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3,4);
        myList.add(5,5);
        myList.showList();


    }

}
