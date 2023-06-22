/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

import java.util.ArrayList;
import java.util.stream.Stream;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author antho
 */
public class BlackJackWindowController {

    @FXML
    Button btnDeal;
    @FXML
    ImageView pc1, pc2, pc3, pc4, pc5, dc1, dc2, IVHit, IVStand;

    ArrayList<Card> playerCards = new ArrayList<Card>();
    int playerCount, dealerCount, playerHits;
    Deck deck = new Deck();
    Timeline timelineDealt;
    Card playerCard1, playerCard2, dealerCard1, dealerCard2;

    @FXML

    public void initialize() {
        deck.setCardImages();
        createTimeline();
        IVHit.setDisable(true);
        IVStand.setDisable(true);
    }

    @FXML
    public void onDeal() throws InterruptedException {
        playerHits = 0;
        pc1.setImage(null);
        pc2.setImage(null);
        pc3.setImage(null);
        pc4.setImage(null);
        pc5.setImage(null);
        deck.resetDeck();
        // btnDeal.setDisable(true);
        playerCard1 = deck.drawRandomCard();
        playerCard2 = deck.drawRandomCard();
        dealerCard1 = deck.drawRandomCard();
        dealerCard2 = deck.drawRandomCard();
        playerCards.add(playerCard1);
        playerCards.add(playerCard2);
        pc1.setImage(playerCard1.image);
        dc1.setImage(dealerCard1.image);
        pc2.setImage(playerCard2.image);
        dc2.setImage(dealerCard2.setHidden());
        timelineDealt.play();
    }

    public void createTimeline() {
        timelineDealt = new Timeline(
                new KeyFrame(Duration.seconds(100),
                        e -> handInPlay()));
        timelineDealt.setRate(5000);
        timelineDealt.setCycleCount(Timeline.INDEFINITE);
    }

    public void handInPlay() {
        playerCount = additionCards();
        dealerCount = 0;
        if (playerCount == 21 && !Stream.of(0, 1, 2, 3, 4).anyMatch(x -> x.equals(dealerCard1.getValue()))) {
            System.out.println("Player BlackJack");
            timelineDealt.stop();
            btnDeal.setDisable(false);
            IVHit.setDisable(true);
            IVStand.setDisable(true);
        }
        IVHit.setDisable(false);
        IVStand.setDisable(false);
        timelineDealt.pause();
        System.out.println("Hit or Stand");
        if (playerCount > 21) {
            System.out.println("Player Bust");
            timelineDealt.stop();
            IVHit.setDisable(true);
            IVStand.setDisable(true);
            playerCount = 0;

        }
    }

    public void calculateDealerCount() {
        dealerCount = dealerCard1.getValue() + dealerCard2.getValue();
    }

    public int additionCards() {
        int total = 0;
        for (int i = 0; i < playerCards.size(); i++) {
            int cardValue;
            Card c = playerCards.get(i);
            int cValue = c.getValue();
            String value = Card.cardValue[cValue];
            if (value.equalsIgnoreCase("ace")) {
                cardValue = 11;
                total = total + cardValue;
                if (total > 21) {
                    total = total - 10;
                }
                continue;
            }
            if (value.equalsIgnoreCase("jack") || value.equalsIgnoreCase("queen") || value.equalsIgnoreCase("King")) {
                cardValue = 10;
                total = total + cardValue;
                continue;
            }
            cardValue = Integer.valueOf(value);
            total = total + cardValue;

        }
        return total;
    }

    @FXML
    public void handleHit() {
        System.out.println("hi");
        if (playerHits == 0) {
            Card playerCard3 = deck.drawRandomCard();
            playerCards.add(playerCard3);
            pc3.setImage(playerCard3.image);
        }
        if (playerHits == 1) {
            Card playerCard4 = deck.drawRandomCard();
            playerCards.add(playerCard4);
            pc4.setImage(playerCard4.image);
        }
        if (playerHits == 2) {
            Card playerCard5 = deck.drawRandomCard();
            playerCards.add(playerCard5);
            pc5.setImage(playerCard5.image);
        }
        playerHits++;
        timelineDealt.play();
    }

    @FXML
    public void handleStand() {
        dc2.setImage(dealerCard2.setUnhidden());
        calculateDealerCount();
        if (dealerCount < 17) {
            dealerHit();
        }
    }

    public void dealerHit() {
    }
    
}
