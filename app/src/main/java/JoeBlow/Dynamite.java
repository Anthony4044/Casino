/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JoeBlow;

import java.util.Random;
import javafx.scene.image.Image;

/**
 *
 * @author antho
 */
public class Dynamite extends Symbol {

    int numberOfDyanmite;

    public Dynamite(double payValue, Image image, String type) {
        super(payValue, image, type);
    }

    public int rngDynamite() {
        Random random = new Random();
        int randomDynamite = random.nextInt(3) + 1;
        return randomDynamite;
    }

    public int getNumberOfDyanmite() {
        return numberOfDyanmite;
    }

    public void setNumberOfDyanmite(int numberOfDyanmite) {
        this.numberOfDyanmite = numberOfDyanmite;
    }

    public double getPayValue() {
        return payValue;
    }

    public void setPayValue(double payValue) {
        this.payValue = payValue;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}



