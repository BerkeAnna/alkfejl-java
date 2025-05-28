package org.openjfx.hellofx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hi! Write your name: ");
        Button button = new Button("Push Me");
        TextField name = new TextField();
        button.setOnAction(actionEvent -> label.setText("Hi " + name.getText() + "!"));
        
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(actionEvent -> { Platform.exit(); });
        
        HBox hbox = new HBox(name, button);
        VBox vbox = new VBox(label, hbox, exitButton);
        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(new StackPane(vbox), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}