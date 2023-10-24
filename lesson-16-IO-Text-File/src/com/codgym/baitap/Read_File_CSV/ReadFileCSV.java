package com.codgym.baitap.Read_File_CSV;

import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        readFileCSV.csvReader();
    }

    private void csvReader() {
        File csvFile = new File("src/com/codgym/baitap/data/csv.txt");
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            if(!csvFile.exists()){
                throw new FileNotFoundException();
            }
            while ((line = br.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
            }
        } catch (Exception e) {
           System.err.println("File not exist or error content");
        }
    }
}
