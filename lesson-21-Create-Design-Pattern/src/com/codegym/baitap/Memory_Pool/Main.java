package com.codegym.baitap.Memory_Pool;

public class Main {

  public static void main(String[] args) {
    Gun gun = new Gun();
    System.out.println("Start");
    gun.fire02();
//    gun.fireInPool();
    System.out.println("Game over");
    System.out.println("Tocal bullet created: " + Bullet.count);
  }
}
