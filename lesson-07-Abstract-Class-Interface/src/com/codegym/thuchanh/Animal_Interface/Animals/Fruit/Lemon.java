package com.codegym.thuchanh.Animal_Interface.Animals.Fruit;

import com.codegym.thuchanh.Animal_Interface.Animals.Interface.FruitInterface;

public class Lemon extends Fruit implements FruitInterface {

  @Override
  public String howtoEat() {
    return "Lemon could be juiced";
  }

  @Override
  public void howToEat() {
    System.out.println("Lemon could be juiced");
  }

  @Override
  public void taste() {
    System.out.println("Lemon is sour");
  }
}
