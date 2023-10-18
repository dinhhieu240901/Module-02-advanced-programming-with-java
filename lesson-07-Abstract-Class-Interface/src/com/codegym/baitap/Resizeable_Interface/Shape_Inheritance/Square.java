package com.codegym.baitap.Resizeable_Interface.Shape_Inheritance;

import com.codegym.baitap.Resizeable_Interface.Drawable;

public class Square extends Rectangle {

  private double side;

  public Square(double side) {
    super(side, side);
  }

  public double getSide() {
    return getWidth();
  }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  @Override
  public String toString() {
    return (
      "A Square with side=" +
      getSide() +
      ", which is a subclass of " +
      super.toString()
    );
  }

  @Override
  public void resize(double percent) {
    setSide(getSide() * percent / 100);
  }

  @Override
  public void draw() {
    System.out.println("Vẽ một hình vuông có cạnh " + getSide());
  }

  @Override
  public void howToColor() {
    System.out.println("Color all four sides.");
  }
}
