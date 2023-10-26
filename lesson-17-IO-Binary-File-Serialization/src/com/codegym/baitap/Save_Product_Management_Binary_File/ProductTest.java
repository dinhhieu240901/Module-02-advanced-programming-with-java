package com.codegym.baitap.Save_Product_Management_Binary_File;

public class ProductTest {

  public static void main(String[] args) {
    ProductList productList = new ProductList();
    productList.addProduct(
      new Product(1, "Laptop", 1000000, "Apple", "Laptop")
    );
    productList.addProduct(
      new Product(2, "Tablet", 500000, "Samsung", "Tablet")
    );
    productList.addProduct(new Product(3, "Phone", 100000, "Apple", "Phone"));
    productList.addProduct(
      new Product(4, "Television", 500000, "Samsung", "32 inch")
    );
    productList.addProduct(
      new Product(5, "Camera", 100000, "Panasonic", "Camera")
    );
    System.out.println("Danh sách sản phẩm: ");
    productList.DisplayProduct();
    int searchID = 2;
    Product foundProduct = productList.searchProduct(searchID);
    if (foundProduct != null) {
      System.out.println("Sản phẩm với ID " + searchID + ":");
      System.out.println(foundProduct);
    } else {
      System.out.println("Không tìm thấy sản phẩm với ID " + searchID);
    }
    ProductList.WriteToFile("src/com/codegym/baitap/data/products.dat");
    ProductList.ReadFromFile("src/com/codegym/baitap/data/products.dat");
    System.out.println("Danh sách sản phẩm sau khi đọc từ file: ");
    productList.DisplayProduct();
  }
}
