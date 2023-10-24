package com.codgym.thuchanh.Sum_Text_File;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/codgym/thuchanh/data/file.txt");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                int sum = 0;
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    try {
                        int number = Integer.parseInt(line);
                        sum += number;
                    } catch (NumberFormatException e) {
                        System.out.println("Dòng không chứa một số nguyên hợp lệ: " + line);
                    }
                }

                System.out.println("Tổng của các số nguyên trong tệp: " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
