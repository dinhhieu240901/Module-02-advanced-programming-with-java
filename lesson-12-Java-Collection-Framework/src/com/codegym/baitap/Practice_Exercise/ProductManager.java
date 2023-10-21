package com.codegym.baitap.Practice_Exercise;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {

  private ArrayList<Product> products = new ArrayList<Product>();

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void setProducts(ArrayList<Product> products) {
    this.products = products;
  }

  //show
  public void showProducts() {
    for (Product product : products) {
      System.out.println(product.toString());
    }
  }

  public Product findProductByName(String name) {
    for (Product product : products) {
      if (product.getName().equals(name)) {
        return product;
      }
    }
    return null;
  }

  public void removeProductById(int id) {
    for (int i = 0; i < products.size(); i++) {
      if (products.get(i).getId() == id) {
        Product remove = products.remove(i);
      }
    }
  }

  public ArrayList<Product> sortInCreasing() {
    products.sort(Comparator.comparing(Product::getPrice));
    return products;
  }

  public ArrayList<Product> sortDecreasing() {
    products.sort(Comparator.comparing(Product::getPrice).reversed());
    return products;
  }
}
