package com.codegym.baitap.Aplly_Factory_Method;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) throws InvalidShapeType{
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> throw new InvalidShapeType("Loại hình không được hỗ trợ"+shapeType);
        };
    }
}
