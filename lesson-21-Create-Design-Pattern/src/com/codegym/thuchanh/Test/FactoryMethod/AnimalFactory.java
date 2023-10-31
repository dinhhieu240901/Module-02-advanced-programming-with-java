package com.codegym.thuchanh.Test.FactoryMethod;

public class AnimalFactory {
    public Animal getAnimal(AnimalType type) throws InvalidAnimalTypeException {
//        if(CANINE.equals(type)){
//            return new Dog();
//        }
//        else if(FELINE.equals(type)) {
//            return new Cat();
//        }
//        throw new InvalidAnimalTypeException("neither dog nor cat");
        return switch (type) {
            case CANINE -> new Dog();
            case FELINE -> new Cat();
            default -> throw new InvalidAnimalTypeException("Invalid type Animals");
        };
    }
}
