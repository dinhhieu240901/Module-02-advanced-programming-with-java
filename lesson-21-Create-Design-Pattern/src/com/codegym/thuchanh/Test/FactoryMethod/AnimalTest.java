package com.codegym.thuchanh.Test.FactoryMethod;

public class AnimalTest {
    public static void main(String[] args) throws Exception {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal(AnimalType.FELINE);
        System.out.println("a1 sound "+a1.makeSound());
        Animal a2 = animalFactory.getAnimal(AnimalType.CANINE);
        System.out.println("a2 sound "+a2.makeSound());

    }
}
