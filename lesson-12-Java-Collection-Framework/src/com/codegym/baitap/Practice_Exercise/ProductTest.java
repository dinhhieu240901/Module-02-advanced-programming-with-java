package com.codegym.baitap.Practice_Exercise;

import java.util.ArrayList;

public class ProductTest {

  public static void main(String[] args) {
    ProductManager productManager = new ProductManager();
    productManager.addProduct(new Product(100, "Samsung", 1000));
    productManager.addProduct(new Product(200, "Apple", 2000));
    productManager.addProduct(new Product(300, "Huawei", 3000));
    System.out.println("Danh sách sản phẩm ");
    productManager.showProducts();
    System.out.println(productManager.findProductByName("Samsung"));
    System.out.println(productManager.findProductByName("Huawei"));
    System.out.println(
      "Danh sách sản phẩm sau khi sắp xếp theo thứ tự tăng dần: "
    );
    System.out.println(productManager.sortInCreasing());
    System.out.println(
      "Danh sách sản phẩm sau khi sắp xếp theo thứ tự giảm dần: "
    );
    System.out.println(productManager.sortDecreasing());
    System.out.println("Danh sách sản phẩm sau khi xóa sản phẩm Huawei là");
    productManager.removeProduct(productManager.findProductByName("Huawei"));
    productManager.showProducts();
    System.out.println("Danh sách sản phẩm sau khi xóa id");
    productManager.removeProductById(100);
    productManager.showProducts();
  }
}
