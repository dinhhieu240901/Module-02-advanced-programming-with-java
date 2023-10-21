package com.codegym.thuchanh.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student("Hiếu", 23, "DN");
    Student student2 = new Student("Thảo", 23, "BD");
    Student student3 = new Student("Hà", 22, "HN");
    Map<Integer, Student> map = new HashMap<Integer, Student>();
    map.put(1, student1);
    map.put(2, student1);
    map.put(3, student3);
    map.put(4,student1);
    for (Map.Entry<Integer, Student> student : map.entrySet()) System.out.println(
      student.toString()
    );
    System.out.println("...........Set");
    Set<Student> set = new HashSet<Student>();
    set.add(student1);
    set.add(student2);
    set.add(student3);
    set.add(student1);
    for (Student student : set) {
        System.out.println(student.toString());
    }
  }
}
