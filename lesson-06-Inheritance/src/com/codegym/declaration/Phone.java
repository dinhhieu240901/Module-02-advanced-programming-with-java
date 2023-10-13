package com.codegym.declaration;

public class Phone {
    private long id;
    private String model;
    private String color;
    private double price;

    public Phone() {

    }

    public Phone(long id, String model, String color, double price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model ;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + this.id + ", model='" + this.model + '\'' + ", color='" + this.color + '\''
                + ", price=" + this.price + '}';
    }
}

class Iphone extends Phone {
    private boolean isHaveButtonVirtual;

    public Iphone(long id, String model, String color, double price) {
        super(id, model, color, price);
    }

    public boolean isHaveButtonVirtual() {
        return isHaveButtonVirtual;
    }

    public void setHaveButtonVirtual(boolean haveButtonVirtual) {
        isHaveButtonVirtual = haveButtonVirtual;
    }

    @Override
    public String toString() {
        return "Iphone{" + "isHaveButtonVirtual=" + isHaveButtonVirtual + '}';
    }

}

class Samsung extends Phone {
    private boolean isHavePen;

    public Samsung(long id, String model, String color, double price) {
        super(id, model, color, price);
    }

    public boolean isHavePen() {
        return isHavePen;
    }

    public void setHavePen(boolean havePen) {
        isHavePen = havePen;
    }

    @Override
    public String toString() {
        return "Samsung{" + "isHavePen=" + isHavePen + '}';
    }

}

class PhoneManagement {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(1, "Iphone 12", "Black", 1000);
        Samsung samsung = new Samsung(2, "Galaxy S21", "White", 900);
        iphone.setHaveButtonVirtual(true);
        System.out.println("Iphone model: " + iphone.getModel());

        System.out.println("Iphone virtual button: " + iphone.isHaveButtonVirtual());
        samsung.setHavePen(true);
        System.out.println("Samsung model: " + samsung.getModel());
        System.out.println("Samsung virtual button: "+ samsung.isHavePen());
    }
}

