package com.codegym.baitap.Aplly_Factory_Method;

public class FactoryPatternDemo {
    public static void main(String[] args) throws InvalidShapeType {
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
            Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
            circle.draw();
            Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
            rectangle.draw();
            ((Rectangle)rectangle).finish();
            Shape square = shapeFactory.createShape(ShapeType.SQUARE);
            square.draw();
        } catch (InvalidShapeType e) {
            System.out.println(e.getMessage());
        }

    }
}

