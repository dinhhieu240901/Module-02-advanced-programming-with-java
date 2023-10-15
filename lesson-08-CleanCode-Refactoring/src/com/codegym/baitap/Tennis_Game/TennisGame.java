package com.codegym.baitap.Tennis_Game;

public class TennisGame {

    public static String calculateScore(String player1Name, String player2Name, int player_score1, int player_score2) {
        StringBuilder score = new StringBuilder();
        int tempScore=0;
        if (player_score1 == player_score2)
        {
            score = calculateDrawScore(player_score1);
        }
        else if (player_score1 >=4 || player_score2 >=4)
        {
            score = calculateWinScore(player_score1, player_score2);
        }
        else
        {
            calculateNormalMatchScore(player_score1, player_score2, score);
        }
        return score.toString();
    }

    private static StringBuilder calculateDrawScore(int player_score1) {
        StringBuilder score;
        score = switch (player_score1) {
            case 0 -> new StringBuilder("Love-All");
            case 1 -> new StringBuilder("Fifteen-All");
            case 2 -> new StringBuilder("Thirty-All");
            case 3 -> new StringBuilder("Forty-All");
            default -> new StringBuilder("Deuce");
        };
        return score;
    }

    private static void calculateNormalMatchScore(int m_score1, int m_score2, StringBuilder score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score.append("-"); tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }

    private static StringBuilder calculateWinScore(int m_score1, int m_score2) {
        StringBuilder score;
        int minusResult = m_score1 - m_score2;
        if (minusResult==1) score = new StringBuilder("Advantage player1");
        else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
        else if (minusResult>=2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }
}
