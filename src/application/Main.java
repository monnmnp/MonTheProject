package application;
	
import Graphic.ResImage;
import Graphic.SceneManager;

import javafx.application.Application;

import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			ResImage.loadResource();
			SceneManager.initialize(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
