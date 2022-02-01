package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {
    int suit;
    int playerNumber;
    int [][] cards = new int[4][13];  // 2d array to store player's suit & rank

    public static void main(String[] args) {
        DeckOfCards dc = new DeckOfCards();
        for(int playerNUmber=1;playerNUmber<=4;playerNUmber++) {
           dc.distributeAllCards(playerNUmber);
        }
    }


    void distributeOneCard(int playerNumber) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if(cards[suit][rank] != 0) {
            distributeOneCard(playerNumber);
        } else {
            cards[suit][rank] = playerNumber;
        }
    }
    void distributeAllCards(int playerNUmber) {
        for(int i=0;i<=9;i++) {
            distributeOneCard(playerNumber);
        }
    }
}
