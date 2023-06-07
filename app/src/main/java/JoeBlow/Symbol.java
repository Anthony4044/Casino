/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JoeBlow;

import javafx.scene.image.Image;

/**
 *
 * @author antho
 */
public class Symbol {

    double payValue;
    Image image;
    String type; 

    
    public Symbol(double payValue, Image image, String type) {   
        this.payValue = payValue;
        this.image = image;
        this.type = type;
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
