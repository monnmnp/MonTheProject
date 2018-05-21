package application;
	
import Graphic.GameStage;
import Graphic.ResImage;
import Graphic.SceneManager;
import character.Generator;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			ResImage.loadResource();
			Pane root = new Pane();
			SceneManager.initialize(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
		System.out.println(Generator.getInstance().getRandomBev().toString());
	}
}
