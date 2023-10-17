package com.codegym.baitap.MyArrayList;

public class MyListTest {

  public static void main(String[] args) {
    //test
    MyList<String> list = new MyList<>();
    //add
    list.add("Hiếu");
    list.add("Thảo");
    list.add("Huy");
    list.add("Việt");
    list.showList();
    //indexOf
      System.out.print("Vị trí của các sinh viên là: " );
    System.out.print(list.indexOf("Thảo")+" ");
    System.out.println(list.indexOf("Hiếu"));
    //remove
    list.remove(1);
    list.showList();
    System.out.println(list.contain("Hiếu"));
    System.out.println(list.contain("Thảo"));
    list.clear();
    System.out.print("Sau khi xóa sạch sinh viên trong danh sách thì kích thước của mảng là : ");
    System.out.println(list.size);

  }
}
