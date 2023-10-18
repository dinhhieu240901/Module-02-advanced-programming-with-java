package com.codegym.baitap.MyLinkedList;

//import java.util.Scanner;

public class MyLinkedListTest {

  public static void main(String[] args) {
    MyLinkedList<String> studentList = new MyLinkedList<>();
    // Thêm các sinh viên vào danh sách
    studentList.addLast("Việt");
    studentList.addLast("Huy");
    studentList.addLast("Giang");
    studentList.addLast("Hiếu");
    studentList.addLast("Thảo");
    System.out.println("Danh sách sinh viên:");
    studentList.printList();
    MyLinkedList<String> clonedList = studentList.clone();
    System.out.println("Danh sách sao chép (clone):");
    clonedList.printList();

    String studentToCheck = "Thảo";
    boolean containsStudent = studentList.contains(studentToCheck);
    System.out.println(
      "Sinh viên " +
      studentToCheck +
      " có trong danh sách không? " +
      containsStudent
    );

    String studentToRemove = "Việt";
    boolean removed = studentList.remove(studentToRemove);
    if (removed) {
      System.out.println(
        "Sinh viên " + studentToRemove + " đã bị xóa khỏi danh sách."
      );
    } else {
      System.out.println(
        "Không tìm thấy sinh viên " + studentToRemove + " trong danh sách."
      );
    }

    System.out.println("Danh sách sau khi xóa:");
    studentList.printList();
    studentList.remove(3);
    System.out.println("Danh sách sau khi xóa:");
    studentList.printList();
    studentList.removeLast();
    System.out.println("Danh sách sau khi xóa cuối:");
    for (int i = 0; i < studentList.size(); i++) {
      String student = studentList.get(i);
      System.out.println(student);
    }
    studentList.removeFirst();
    System.out.println("Danh sách sau khi xóa đầu:");
    studentList.printList();
    String studentToFind = "Giang";
    int index = studentList.indexOf(studentToFind);
    if (index != -1) {
      System.out.println(
        "Sinh viên " + studentToFind + " được tìm thấy tại vị trí " + index
      );
    } else {
      System.out.println(
        "Không tìm thấy sinh viên " + studentToFind + " trong danh sách."
      );
    }
    studentList.clear();
    System.out.print("Danh sách sinh viên sau khi xóa phần tử là : ");
    System.out.println(studentList.size());
  }
}
