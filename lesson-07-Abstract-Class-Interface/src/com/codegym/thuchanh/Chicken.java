package com.codegym.thuchanh;
import com.codegym.thuchanh.Interface.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }


}