package org.openjfx.mini;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Main extends Application {
	private Scene scene1, scene2;

    @Override
    public void start(Stage stage) {
    	SceneManager.init(stage);
    	
    	Button btn1 = new Button("Go to scene 2");
    	btn1.setOnAction(event -> SceneManager.setActualScene("scene2"));
    	StackPane sp1 = new StackPane(btn1);
    	scene1 = new Scene(sp1, 640, 480);
    	
    	Button btn2 = new Button("Go to scene 1");
    	btn2.setOnAction(event -> SceneManager.setActualScene("scene1") );
    	StackPane sp2 = new StackPane(btn2);
    	scene2 = new Scene(sp2, 640, 480);
    	
    	SceneManager.addScene("scene1", scene1);
    	SceneManager.addScene("scene2", scene2);
    	SceneManager.setActualScene("scene1");
    	
    	stage.show();
    
    	
    }
    

    public static void main(String[] args) {
        launch();
    }

}