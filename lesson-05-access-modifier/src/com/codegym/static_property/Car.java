package com.codegym.static_property;

public class Car {
    public static int numberOfCars;
    private String name;
    private String engine;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    
}
