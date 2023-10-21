package com.codegym.baitap.DemergingQueue;

public class ManageStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Hiếu", "nam", "01-01-2001");
        Student s2 = new Student("Thảo", "nữ", "02-01-1999");
        Student s3 = new Student("Huy", "nam", "02-01-1992");
        Student s4 = new Student("Việt", "nam", "10-12-1996");
        Student s5 = new Student("Giang", "nữ", "10-12-2001");

        DeMerging list = new DeMerging();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.sortByDateOfBirth(list.combined);
        list.printList();

    }
}
