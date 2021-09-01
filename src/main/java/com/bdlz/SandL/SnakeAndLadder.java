package com.bdlz.SandL;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;
    public static int playerPosition = 0;

    static int diceCount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder project");
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

            if (position - diceNumber > playerPosition) {
                position = position - diceNumber;
            } else if (position < playerPosition) {
                position = playerPosition;
                System.out.println("Player moves below zero and starts from Zero");
            }
        } else if (option == IS_LADDER) {
            System.out.println("It's Ladder ");

            if (position + diceNumber <= WINNING_POSITION) {
                position = position + diceNumber;
            }else if (position > WINNING_POSITION) {
                position = WINNING_POSITION;
                System.out.println("Player moves above 100 and stoped");
            }
        } else{
            System.out.println("No play");
        }
        System.out.println("dice count " + diceCount);
        System.out.println("playerPosition " + position);
        return position;
    }
}

