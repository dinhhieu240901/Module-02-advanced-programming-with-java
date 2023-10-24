package com.codgym.baitap.Copy_File_Text;

import java.io.*;

public class CopyText {

  public static void main(String[] args) {
    File sourceFile = new File("src/com/codgym/baitap/data/file1.txt");
    File targetFile = new File("src/com/codgym/baitap/data/file2.txt");

    try (
      BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(targetFile, true)
      )
    ) {
      if (!sourceFile.exists() || !targetFile.exists()) {
      throw  new FileNotFoundException();
      }
      int character;
      int characterCount = 0;

      while ((character = reader.read()) != -1) {
        writer.write(character);
        characterCount++;
      }
      writer.newLine();

      System.out.println("File copied successfully.");
      System.out.println("Character count: " + characterCount);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
