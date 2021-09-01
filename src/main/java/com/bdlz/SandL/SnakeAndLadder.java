package com.bdlz.SandL;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    static int diceCount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder project");
        int playerPosition = 0;
        while (playerPosition < WINNING_POSITION) {
            ++diceCount;
            playerPosition = getPosition(playerPosition);
        }
    }
    public static int getPosition(int position) {
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (option == IS_SNAKE) {
            System.out.println("It's Snake");

            if (position - diceNumber > 0) {
                position -= diceNumber;
            }
        } else if (option == IS_LADDER) {
            System.out.println("It's Ladder ");

            if (position + diceNumber <= 100) {
                position += diceNumber;
            }
        } else {
            System.out.println("No play");
        }

        return position;
    }
}

