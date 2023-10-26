package com.codegym.baitap.Copy_File_Binaray;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyFileBinary {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the source file name:");
    String sourceFileName = scanner.nextLine();
    System.out.println("Enter the destination file name:");
    String destinationFileName = scanner.nextLine();
    File sourceFile = new File(sourceFileName);
    File destFile = new File(destinationFileName);
    copyFileUsingStream(sourceFile, destFile);
  }

  private static void copyFileUsingStream(File sourceFile, File destFile) {
    try {

      if (!sourceFile.exists()) {
        throw new FileNotFoundException(sourceFile + " does not exist");
      }
      if (destFile.exists()) {
        throw new FileAlreadyExistsException(destFile + " already exists");
      }
      InputStream is = new FileInputStream(sourceFile);
      OutputStream os = new FileOutputStream(destFile);
      byte[] buffer = new byte[1024];
      int length;
      int totalBytes = 0;
      while ((length = is.read(buffer)) != -1) {
        os.write(buffer, 0, length);
        totalBytes += length;
      }
      System.out.println(
        "File copied successfully. Total bytes: " + totalBytes
      );
      is.close();
      os.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
