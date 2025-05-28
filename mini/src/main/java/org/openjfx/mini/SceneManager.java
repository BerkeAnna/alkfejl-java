package org.openjfx.mini;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
	
	private static Stage mainWindow;
	private static Scene actualScene;
	
	private static Map<String, Scene> scenes = new HashMap<>();
	
	public static void addScene(String sceneId, Scene scene) {
		scenes.put(sceneId, scene);
	}
	
	public static void setActualScene(String sceneId) {
		SceneManager.actualScene = scenes.get(sceneId);
		SceneManager.mainWindow.setScene(SceneManager.actualScene);
		SceneManager.mainWindow.setTitle("Actual scene: " + sceneId);
	}
	
	public static Scene getActualScene() {
		return actualScene;
	}

	public static void init(Stage mainWindow) {
		SceneManager.mainWindow = mainWindow;
	}

}
