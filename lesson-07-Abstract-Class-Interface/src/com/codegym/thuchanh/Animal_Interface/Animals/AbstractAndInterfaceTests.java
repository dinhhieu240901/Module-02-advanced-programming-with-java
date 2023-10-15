package com.codegym.thuchanh.Animal_Interface.Animals;

import com.codegym.thuchanh.Animal_Interface.Animals.Animal;
import com.codegym.thuchanh.Animal_Interface.Animals.Chicken;
import com.codegym.thuchanh.Animal_Interface.Animals.Tiger;
import com.codegym.thuchanh.Animal_Interface.Animals.Fruit.Fruit;
import com.codegym.thuchanh.Animal_Interface.Animals.Fruit.Lemon;
import com.codegym.thuchanh.Animal_Interface.Animals.Fruit.Orange;
import com.codegym.thuchanh.Animal_Interface.Animals.Interface.Edible;
import com.codegym.thuchanh.Animal_Interface.Animals.Interface.FruitInterface;

public class AbstractAndInterfaceTests {

  public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0] = new Tiger();
    animals[1] = new Chicken();
    for (Animal animal : animals) {
      if (animal instanceof Edible) {
        Edible edibleAnimal = (Edible) animal;
        edibleAnimal.hanhdong();
      }

      System.out.println(animal.makeSound());
      if (animal instanceof Chicken) {
        System.out.println(((Chicken) animal).howToEat());
      }
    }

    Fruit[] fruits = new Fruit[2];
    fruits[0] = new Lemon();
    fruits[1] = new Orange();
    for (Fruit fruit : fruits) {
      System.out.println(fruit.howtoEat());
      if (fruit instanceof FruitInterface) {
        ((FruitInterface) fruit).howToEat();
      }
      if (fruit instanceof Lemon) {
        ((Lemon) fruit).taste();
      }
    }
  }
}
