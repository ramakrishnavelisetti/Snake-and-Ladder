package com.bdlz.SandL;

public class SnakeAndLadder {
    public static final int WINNING_POSITION = 100;
    static int diceCount = 0;
    public static void main(String[] args) {
        int playerPosition = 0;
        while (playerPosition < WINNING_POSITION) {
            ++diceCount;
        }
    }
}
