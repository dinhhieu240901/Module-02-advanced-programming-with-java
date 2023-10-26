package com.codegym.thuchanh.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private final int id;
    private final String name;
    private final String address;

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return (
                "Person{" +
                        "id=" +
                        id +
                        ", name='" +
                        name +
                        '\'' +
                        ", address='" +
                        address +
                        '\'' +
                        '}'
        );
    }

    public static void writeDataToFile(String path, List<Person> people) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readDataFromFile(String path) {
        List<Person> people;
        try (FileInputStream fis = new FileInputStream(path)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            people = (List<Person>) ois.readObject();
            ois.close();
            fis.close();
            return people;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Person(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Person(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Person(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Person(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("src/com/codegym/thuchanh/data/demo.txt", students);
        List<Person> studentDataFromFile = readDataFromFile(
                "src/com/codegym/thuchanh/data/demo.txt"
        );
        assert studentDataFromFile != null;
        for (Person student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
