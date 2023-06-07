/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JoeBlow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author antho
 */
public class OpenSlot extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setOnCloseRequest(e -> closedSlot());
        SlotWindowController mainController = new SlotWindowController();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(
                "/fxml/JoeBlow.fxml"));
        loader.setController(mainController);
        Pane root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle(
                "Joe Blow");
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public void closedSlot() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
