package com.codegym.baitap.MyLinkedList;

import java.util.Scanner;

public class MyLinkedListTest {

  public static void main(String[] args) {
    //Test

        MyLinkedList<String> studentList = new MyLinkedList<>();

        // Thêm các sinh viên vào danh sách
        studentList.addLast("Việt");
        studentList.addLast("Huy");
        studentList.addLast("Giang");
        studentList.addLast("Hiếu");
        studentList.addLast("Thảo");
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < studentList.size(); i++) {
          String student = (String) studentList.get(i);
          System.out.println(student);
        }

        String studentToCheck = "Thảo";
        boolean containsStudent = studentList.contains(studentToCheck);
        System.out.println("Sinh viên " + studentToCheck + " có trong danh sách không? " + containsStudent);

        String studentToRemove = "Việt";
        boolean removed = studentList.remove(studentToRemove);
        if (removed) {
          System.out.println("Sinh viên " + studentToRemove + " đã bị xóa khỏi danh sách.");
        } else {
          System.out.println("Không tìm thấy sinh viên " + studentToRemove + " trong danh sách.");
        }

        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < studentList.size(); i++) {
          String student = (String) studentList.get(i);
          System.out.println(student);
        }
    String studentToFind = "Giang";
    int index = studentList.indexOf(studentToFind);
    if (index != -1) {
      System.out.println("Sinh viên " + studentToFind + " được tìm thấy tại vị trí " + index);
    } else {
      System.out.println("Không tìm thấy sinh viên " + studentToFind + " trong danh sách.");
    }
      }
    }




