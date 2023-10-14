package com.codegym.thuchanh;
import com.codegym.thuchanh.Animals.Chicken;
import com.codegym.thuchanh.Animals.Tiger;
import com.codegym.thuchanh.Animals.Animal;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println( ((Chicken) animal).howToEat());
            }
        }
        
        
    }
}
