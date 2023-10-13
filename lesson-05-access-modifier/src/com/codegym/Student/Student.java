package com.codegym.Student;

public class Student {
    private String name = "Hiếu";
    private String classes = "C0823H1";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}

class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        System.out.println(student.getName());
        System.out.println(student);
        student.setClasses("C01");
    }
}