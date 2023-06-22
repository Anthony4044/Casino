/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

/**
 *
 * @author antho
 */
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> remouvedCards;

    public Deck() {
        cards = new ArrayList<Card>();
        remouvedCards = new ArrayList<Card>();

        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 12; b++) {
                cards.add(new Card(a, b));
            }
        }
    }

    public Card drawRandomCard() {
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        remouvedCards.add(cards.get(index));
        cards.remove(cards.get(index));
        return cards.get(index);
    }

    public void setCardImages() {
        for (int i = 0; i < 52; i++) {
            int cardType = this.cards.get(i).getType();
            String type = Card.cardType[cardType];
            int cardValue = this.cards.get(i).getValue();
            String value = Card.cardValue[cardValue];
            String url = "/imagesCards/" + value + "_of_" + type + ".png";
            this.cards.get(i).image = new Image(url);
        }
    }

    public void resetDeck() {
        for (int i = 0; i < remouvedCards.size(); i++) {
            cards.add(remouvedCards.get(i));
            remouvedCards.remove(i);
        }
    }

    public String toString() {
        String result = "Cards remaining in deck: " + cards;

        return result;

    }

}
