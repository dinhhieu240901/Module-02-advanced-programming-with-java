package com.codegym.baitap.Display_Odd_Even_Number;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
