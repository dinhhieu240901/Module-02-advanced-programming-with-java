package com.codegym.baitap.Save_Product_Management_Binary_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductList {

  private static List<Product> productList;

  public ProductList() {
    productList = new ArrayList<>();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }
  public void DisplayProduct() {
    for (Product product : productList) {
      System.out.println(product);
    }
  }

  public Product searchProduct(int id) {
    for (Product product : productList) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  public static void WriteToFile(String filePath) {
    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(productList);
      oos.close();
    } catch (IOException e) {
      System.out.println("Lỗi khi ghi file: " + e.getMessage());
    }
  }

  public static void ReadFromFile(String filePath) {
    try {
      FileInputStream fis = new FileInputStream(filePath);
      ObjectInputStream ois = new ObjectInputStream(fis);
      productList = (ArrayList<Product>) ois.readObject();
      ois.close();
      fis.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Lỗi khi đọc file: " + e.getMessage());
    }
  }
}
