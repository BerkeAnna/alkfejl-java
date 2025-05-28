package org.openjfx.hellofx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Clcik the button!");
        Button button = new Button("Push Me");
        button.setOnAction(actionEvent -> label.setText("Clicked"));
        
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(actionEvent -> { Platform.exit(); });
        
        VBox vbox = new VBox(label, button, exitButton);
        
        Scene scene = new Scene(new StackPane(vbox), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}