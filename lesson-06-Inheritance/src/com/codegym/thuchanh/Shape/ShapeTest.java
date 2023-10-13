package com.codegym.thuchanh.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle); // In thông tin về hình tròn

        // Tạo một đối tượng Rectangle
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle); // In thông tin về hình chữ nhật

        // Tạo một đối tượng Square
        Square square = new Square(2.5);
        System.out.println(square); // In thông tin về hình vuông

        Shape square2 = new Square(2.6);
        System.out.println(square2);

           }
}
