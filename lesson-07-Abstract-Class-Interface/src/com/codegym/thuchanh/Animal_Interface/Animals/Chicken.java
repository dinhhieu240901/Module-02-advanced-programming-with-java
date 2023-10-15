package com.codegym.thuchanh.Animal_Interface.Animals;

import com.codegym.thuchanh.Animal_Interface.Animals.Interface.Edible;

public class Chicken extends Animal implements Edible {

  @Override
  public String makeSound() {
    return "Chicken: cluck-cluck!";
  }

  @Override
  public String howToEat() {
    return "could be fried";
  }

  @Override
  public void hanhdong() {
    System.out.println("Chicken is eating ");
  }
}
