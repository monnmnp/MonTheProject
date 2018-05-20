package Graphic;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Holder;
import logic.Manager;

public class SceneManager {
	private static Stage primaryStage;
	public static final double SCENE_WIDTH = 700;
	public static final double SCENE_HEIGHT = 550;
	
	private static Pane mainManu = new OpeningGame();
	private static Scene mainScene = new Scene(mainManu,SCENE_WIDTH,SCENE_HEIGHT);
	private static Pane gameStage = new GameStage();
	
	public static void initialize(Stage stage) {
		primaryStage = stage;
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void gotoOpeningGame() {
		primaryStage.setScene(mainScene);
	}
	
	public static void gotoThisScene(Pane pane) {
		Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
		primaryStage.setScene(scene);
	}
	
	public static void goToGameScene() {
//		Manager.startGame();
		Scene scene = new Scene(Holder.getInstance().getGameStage());
		primaryStage.setScene(scene);
	}
}
