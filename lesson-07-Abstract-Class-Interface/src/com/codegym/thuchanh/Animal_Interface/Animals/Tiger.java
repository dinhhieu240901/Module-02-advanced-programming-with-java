package com.codegym.thuchanh.Animal_Interface.Animals;

import com.codegym.thuchanh.Animal_Interface.Animals.Interface.Edible;

public class Tiger extends Animal implements Edible {

  @Override
  public String makeSound() {
    return "Tiger: roarrrrr!";
  }

  @Override
  public String howToEat() {
    return "could be fried";
  }

  @Override
  public void hanhdong() {
    System.out.println("Tiger is eating ");
  }
}
