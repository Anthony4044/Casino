/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

import javafx.scene.image.Image;

/**
 *
 * @author antho
 */
public class Card {

    private int type, value;
    public Image image;
    public static String[] cardType = {"clubs", "spades", "diamonds", "hearts"};
    public static String[] cardValue = {"ace", "king", "queen", "jack", "10",
        "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int types, int values) {
        type = types;
        value = values;
    }

    public Image setHidden() {
        return new Image("/imagesCards/backOfCard.png");
    }

    public Image setUnhidden() {
        int cardType = this.getType();
        String type = Card.cardType[cardType];
        int cardValue = this.getValue();
        String value = Card.cardValue[cardValue];
        String url = "/imagesCards/" + value + "_of_" + type + ".png";
        return new Image(url);
    }

    public String toString() {
        String finalCard = cardValue[value] + " of " + cardType[type];

        return finalCard;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
