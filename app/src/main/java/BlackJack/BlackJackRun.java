/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author antho
 */
public class BlackJackRun extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setOnCloseRequest(e -> closedTable());
        BlackJackWindowController mainController = new BlackJackWindowController();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(
                "/fxml/BlackJack.fxml"));
        loader.setController(mainController);
        Pane root = loader.load();
        Scene scene = new Scene(root, 1000, 580);
        primaryStage.setScene(scene);
        primaryStage.setTitle(
                "Spanish Black Jack");
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public void closedTable() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
