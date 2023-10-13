package com.codegym.declareType_actualType;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(4, "David"));
        students.add(new Student(5, "Eve"));
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.addAll(students);
        System.out.println("LinkedList: " + studentList);

    }
}
