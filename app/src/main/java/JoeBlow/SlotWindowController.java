/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JoeBlow;

import java.util.ArrayList;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author antho
 */
public class SlotWindowController {

    @FXML
    ImageView C1R1, C1R2, C1R3, C2R1, C2R2, C2R3, C3R1, C3R2, C3R3, C4R1, C4R2, C4R3, C5R1, C5R2, C5R3;
    @FXML
    Button spin;

    ArrayList<Symbol> probabilityList = new ArrayList<Symbol>();
    Symbol[][] slot = new Symbol[5][3];

    @FXML
    public void initialize() {
        generateSymbolProbabilityArray();
    }

    @FXML
    public void handleSpinSlot() {
        generateSymbolsIntoSlot();
    }

    public void generateSymbolProbabilityArray() {
        for (int i = 0; i < 112; i++) {
            if (i < 14) {
                Symbol s = new Symbol(0, new Image("/images/9.png"), "9");
                probabilityList.add(s);
            }
            if (i > 13 && i < 27) {
                Symbol s = new Symbol(0, new Image("/images/10.png"), "10");
                probabilityList.add(s);
            }
            if (i > 26 && i < 39) {
                Symbol s = new Symbol(0, new Image("/images/Jack.png"), "Jack");
                probabilityList.add(s);
            }
            if (i > 38 && i < 50) {
                Symbol s = new Symbol(0, new Image("/images/Queen.png"), "Queen");
                probabilityList.add(s);
            }
            if (i > 49 && i < 60) {
                Symbol s = new Symbol(0, new Image("/images/King.png"), "King");
                probabilityList.add(s);
            }
            if (i > 59 && i < 69) {
                Symbol s = new Symbol(0, new Image("/images/Ace.png"), "Ace");
                probabilityList.add(s);
            }
            if (i > 68 && i < 76) {
                Symbol s = new Symbol(0, new Image("/images/Pickaxe.png"), "Pickaxe");
                probabilityList.add(s);
            }
            if (i > 75 && i < 84) {
                Symbol s = new Symbol(0, new Image("/images/Lantern.png"), "Lantern");
                probabilityList.add(s);
            }
            if (i > 83 && i < 90) {
                Symbol s = new Symbol(0, new Image("/images/Barrel.png"), "Barrel");
                probabilityList.add(s);
            }
            if (i > 89 && i < 95) {
                Symbol s = new Symbol(0, new Image("/images/Rock.png"), "Rock");
                probabilityList.add(s);
            }
            if (i > 94 && i < 99) {
                Symbol s = new Symbol(0, new Image("/images/Joe.png"), "Joe");
                probabilityList.add(s);
            }
            if (i > 98 && i < 103) {
                Symbol s = new Symbol(0, new Image("/images/Wild.png"), "Wild");
                probabilityList.add(s);
            }
            if (i > 102 && i < 107) {
                Symbol s = new Symbol(0, new Image("/images/Bonus.png"), "Bonus");
                probabilityList.add(s);
            }
            if (i > 106 && i < 112) {
                Dynamite d = new Dynamite(0, null, "Dynamite");
                d.setNumberOfDyanmite(d.rngDynamite());
                if (d.getNumberOfDyanmite() == 1) {
                    d.setImage(new Image("/images/Dynamite1.png"));
                }
                if (d.getNumberOfDyanmite() == 2) {
                    d.setImage(new Image("/images/Dynamite1.png"));
                }
                if (d.getNumberOfDyanmite() == 3) {
                    d.setImage(new Image("/images/Dynamite3.png"));
                }
                probabilityList.add(d);
            }
        }
    }

    public void generateSymbolsIntoSlot() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                slot[i][j] = probabilityList.get(randomInt111());
            }
        }

        C1R1.setImage(slot[0][0].image);
        C1R2.setImage(slot[0][1].image);
        C1R3.setImage(slot[0][2].image);
        C2R1.setImage(slot[1][0].image);
        C2R2.setImage(slot[1][1].image);
        C2R3.setImage(slot[1][2].image);
        C3R1.setImage(slot[2][0].image);
        C3R2.setImage(slot[2][1].image);
        C3R3.setImage(slot[2][2].image);
        C4R1.setImage(slot[3][0].image);
        C4R2.setImage(slot[3][1].image);
        C4R3.setImage(slot[3][2].image);
        C5R1.setImage(slot[4][0].image);
        C5R2.setImage(slot[4][1].image);
        C5R3.setImage(slot[4][2].image);

    }

    public int randomInt111() {
        Random random = new Random();
        return random.nextInt(112);
    }
}
