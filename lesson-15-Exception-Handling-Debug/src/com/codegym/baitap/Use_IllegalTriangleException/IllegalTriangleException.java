package com.codegym.baitap.Use_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    //Viết một ứng dụng nhập vào 3 cạnh của hình tam giác. Kiểm tra nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            int a = scanner.nextInt();

            System.out.print("Nhập cạnh b: ");
            int b = scanner.nextInt();

            System.out.print("Nhập cạnh c: ");
            int c = scanner.nextInt();

            checkTriangle(a, b, c);

            System.out.println("Tam giác hợp lệ.");
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
    public static void checkTriangle(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Cạnh của tam giác không thể là số âm hoặc bằng 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("Tổng hai cạnh không lớn hơn cạnh còn lại.");
        }
    }

}
