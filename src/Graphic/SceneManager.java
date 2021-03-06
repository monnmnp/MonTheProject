package Graphic;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Holder;
import logic.Manager;

public class SceneManager {
	private static Stage primaryStage;
	public static final double SCENE_WIDTH = 700;
	public static final double SCENE_HEIGHT = 550;
	
	private static Pane mainManu;
	private static Scene mainScene;
	private static Pane scoreBoard = new ScoreBoard();
	
	public static void initialize(Stage stage) {
		mainManu = new OpeningGame();
		mainScene = new Scene(mainManu,SCENE_WIDTH,SCENE_HEIGHT);
		primaryStage = stage;
		primaryStage.setTitle("SMOOTHIES GUY");
		primaryStage.setResizable(false);
		primaryStage.show();
		gotoOpeningGame();
	}
	
	public static void gotoOpeningGame() {
		primaryStage.setScene(mainScene);
		Manager.getInstance().runAnimationTimer();
	}
		
	public static void gotoScoreBoard() {
		Scene scene = new Scene(Holder.getInstance().getScoreBoard());
		primaryStage.setScene(scene);
	}
	
	public static void goToGameScene() {
		Manager.getInstance().startGame();
		Scene scene = new Scene(Holder.getInstance().getGameStage());
		ResImage.playS.setVolume(2);
		ResImage.playS.play();
		primaryStage.setScene(scene);
	}
}
