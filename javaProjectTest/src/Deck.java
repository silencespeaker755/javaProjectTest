// import java.util.ArrayList;

import java.util.HashMap;
import java.util.Random;

class Card {
    private String cardColor;
    private int cardNumber;

    public Card() {
        this.cardColor = "Joker";
        this.cardNumber = 0;
    }

    public Card(String Color, int Number){
        this.cardColor = Color;
        this.cardNumber = Number;
    }

    public String getCardColor() {
        return cardColor;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCard(String Color,int Number) {
        this.cardColor = Color;
        this.cardNumber = Number;
    }
}

public class Deck {
    HashMap<Integer, String> colorMap = new HashMap<Integer, String>();
    private void colorMkdir() {
        colorMap.put(0, "Spader");
        colorMap.put(1, "Heart");
        colorMap.put(2, "Diamond");
        colorMap.put(3, "Club");
    }

    Card[][] poker = new Card[4][13];
    public void generateDeck() {
        this.colorMkdir();
        for (int i = 0; i < 4;i++){
            for(int j = 0;j < 13;j++){
                poker[i][j].setCard(colorMap.get(i), j+1);
            }
        }
    }
    public void shuffle() {
        Random r1 = new Random();
        Card temp = new Card();
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 13;j++){
                int index = r1.nextInt(52);
                temp = poker[i][j];
                poker[i][j] = poker[index/4][index%13];
                poker[index/4][index%13] = temp;
            }
        }
    }
}
