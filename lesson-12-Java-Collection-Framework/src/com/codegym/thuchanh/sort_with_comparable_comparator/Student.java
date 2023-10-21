package com.codegym.thuchanh.sort_with_comparable_comparator;

import java.text.CollationElementIterator;
import java.util.*;

public class Student implements Comparable<Student> {

  private String name;
  private Integer age;
  private String address;

  public Student(String name, Integer age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + '}';
  }

  @Override
  public int compareTo(Student student) {
    return this.getName().compareTo(student.getName());
  }

  public static void main(String[] args) {
    Student student1 = new Student("Hiếu", 23, "DN");
    Student student2 = new Student("Thảo", 23, "BD");
    Student student3 = new Student("Hà", 22, "HN");
    List<Student> students = new ArrayList<Student>();
    students.add(0, student1);
    students.add(1, student2);
    students.add(2, student3);
    Collections.sort(students);
    for (Student st : students) {
      System.out.println(st.toString());
    }
    AgeComparator ageComparator = new AgeComparator();
    students.sort(ageComparator);
    for (Student st : students) {
      System.out.println(st.toString());
    }
  }
}

class AgeComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.getAge() > o2.getAge()) {
      return 1;
    } else if (o1.getAge().equals(o2.getAge())) {
      return -1;
    } else {
      return 0;
    }
  }
}
