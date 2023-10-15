package com.codegym.baitap.Tennis_Game;

public class TestTennisGame {
    public static void main(String[] args) {
        System.out.println("Test với số điểm khác nhau:");
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 0, 0));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 1, 1));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 3, 2));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 4, 3));

        // Dùng các ví dụ kiểm tra với số điểm giống nhau
        System.out.println("\nTest với số điểm giống nhau:");
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 2, 2));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 1, 1));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 3, 3));
        System.out.println(TennisGame.calculateScore("Player 1", "Player 2", 0, 0));
    }
}
