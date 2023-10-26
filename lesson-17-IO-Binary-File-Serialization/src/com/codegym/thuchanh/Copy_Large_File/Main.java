package com.codegym.thuchanh.Copy_Large_File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

  private static void copyFileUsingJava7File(File source, File dest)
    throws IOException {
    Files.copy(
      source.toPath(),
      dest.toPath(),
      StandardCopyOption.REPLACE_EXISTING
    );
  }

  private static void copyFileUsingStream(File source, File dest)
    throws IOException {
      try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
          byte[] buffer = new byte[1024];
          int length;
          while ((length = is.read(buffer)) != -1) {
              os.write(buffer, 0, length);
          }
      }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the source file name:");
    String sourceFileName = scanner.nextLine();
    System.out.println("Enter the destination file name:");
    String destinationFileName = scanner.nextLine();
    File source = new File(sourceFileName);
    File dest = new File(destinationFileName);
    try {
      copyFileUsingJava7File(source, dest);
      System.out.println("File copied successfully.");
    } catch (IOException e) {
      System.out.println("File copy failed.");
      System.out.println(e.getMessage());
    }
  }
}
