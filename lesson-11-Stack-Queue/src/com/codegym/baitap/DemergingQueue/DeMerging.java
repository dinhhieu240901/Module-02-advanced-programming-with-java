package com.codegym.baitap.DemergingQueue;

import java.util.*;

public class DeMerging implements Comparator<Student> {

  private final List<Student> males;
  private final  List<Student> females;
  List<Student> combined;

  public DeMerging() {
    males = new ArrayList<>();
    females = new ArrayList<>();
    combined = new ArrayList<>();
  }

  public void add(Student o1) {
    combined.add(o1);
  }

  @Override
  public int compare(Student o1, Student o2) {
//      if (o1.getYear() != o2.getYear()) {
//          return Integer.compare(o1.getYear(), o2.getYear());
//      }
//      if (o1.getMonth() != o2.getMonth()) {
//          return Integer.compare(o1.getMonth(), o2.getMonth());
//      }
//      return Integer.compare(o1.getDay(), o2.getDay());
      int yearCompare = Integer.compare(o1.getYear(), o2.getYear());
      int monthCompare = Integer.compare(o1.getMonth(), o2.getMonth());
      int dayCompare = Integer.compare(o1.getDay(), o2.getDay());

      return yearCompare != 0 ? yearCompare : (monthCompare != 0 ? monthCompare : dayCompare);
    }

  public void sortByDateOfBirth(List<Student> combined){
//    for (int i = 0; i < this.combined.size() - 1; i++) {
//      for (int j = 0; j < this.combined.size() - i - 1; j++) {
//        if (compare(this.combined.get(j), this.combined.get(j + 1)) > 0) {
//          Student temp = this.combined.get(j);
//          this.combined.set(j, this.combined.get(j + 1));
//          this.combined.set(j + 1, temp);
//        }
//      }
//    }
      combined.sort(this);
    sortByGender();
  }
  public void sortByGender() {
    for (Student e : combined) {
      (e.getGender().equals("nữ") ? females : males).add(e);
    }

    combined.clear();
    combined.addAll(females);
    combined.addAll(males);

      combined.sort((Student e1, Student e2) -> e2.getGender().compareTo(e1.getGender()));

  }
  public void printList() {
    for (Student e : combined) {
      System.out.println(e.getName() + " " + e.getGender() + " " + e.getBirthDate());
    }
  }
}
