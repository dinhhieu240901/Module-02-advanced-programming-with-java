package com.codegym.baitap.stopwatch_class;

import java.util.Scanner;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        int choice;
        do {
            System.out.println("\n1. Start stopwatch");
            System.out.println("2. End stopwatch");
            System.out.println("3. Get elapsed time");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
            case 1:
                stopWatch.start();
                System.out.println("Stopwatch started.");
                break;
            case 2:
                stopWatch.stop();
                System.out.println("Stopwatch stopped.");
                break;
            case 3:
                System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds.");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        } while (true);
    }
}


