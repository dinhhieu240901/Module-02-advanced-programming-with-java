package com.codegym.baitap.Save_Product_Management_Binary_File;

import java.io.Serializable;

public class Product implements Serializable {

  private final int id;
  private final String name;
  private final double price;
  private final String manufacturer;
  private final String description;

    public Product(int id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
