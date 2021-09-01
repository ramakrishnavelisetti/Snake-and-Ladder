package com.bdlz.SandL;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    static int diceCount = 0;
    static String turn = "player1";

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder project");
        int player1Position = 0;
        int player2Position = 0;
        int player1DiceCount = 0;
        int player2DiceCount = 0;
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            ++diceCount;
            if (turn.equals("player1")) {
                turn = "player2";
                ++player1DiceCount;
                player1Position = getPosition(player1Position);
            } else {
                ++player2DiceCount;
                turn = "player1";
                player2Position = getPosition(player2Position);
            }
        }

        if (player1Position == WINNING_POSITION) {
            System.out.println("Player1 win the game");
            System.out.println("dice count " + player1DiceCount);
        } else {
            System.out.println("Player2 win the game");
            System.out.println("dice count " + player2DiceCount);
        }
        System.out.println("Total dice count " + diceCount);

        System.out.println("player1Position " + player1Position);
        System.out.println("player2Position " + player2Position);

    }

    private static int getPosition(int position) {
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (option == IS_SNAKE) {
            System.out.println("Snake for the player");
            if (position - diceNumber > 0) {
                position -= diceNumber;
            }
        } else if (option == IS_LADDER) {
            System.out.println("Ladder for the player");
            if (turn.equals("player1")) {
                turn = "player1";
            } else if (turn.equals("player2")) {
                turn = "player2";
            }
            if (position + diceNumber <= 100) {
                position += diceNumber;
            }
        } else {
            System.out.println("No play for the player");
        }
        return position;
    }
}