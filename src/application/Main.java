package application;
	
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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	private Canvas main = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private Font nameFont  = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/hotpizza.ttf"), 80);
	private Font stFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	public Canvas testt = new Canvas(200,100);
	@Override
	public void start(Stage primaryStage) {
		try {
			ResImage.loadResource();
			Pane root = new Pane();
			GraphicsContext gc = main.getGraphicsContext2D();
			gc.drawImage(ResImage.mainBG, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
			gc.setFont(nameFont);
			gc.setFill(Color.WHITE);
			gc.setTextBaseline(VPos.CENTER);
			gc.setTextAlign(TextAlignment.CENTER);
			gc.fillText("SMOOTHIES\nGUY", SceneManager.SCENE_WIDTH/2, SceneManager.SCENE_HEIGHT/3);
			gc.setStroke(Color.CHOCOLATE);
			gc.setLineWidth(3);
			gc.strokeText("SMOOTHIES\nGUY", SceneManager.SCENE_WIDTH/2, SceneManager.SCENE_HEIGHT/3);
			
			Canvas test = new Canvas(200,90);
			GraphicsContext gct = test.getGraphicsContext2D();
			gct.setFill(Color.rgb(200, 200, 200, 0.9));
			gct.fillRoundRect(0, 0, 200, 90, 30, 30);
			test.setTranslateX(SceneManager.SCENE_WIDTH/3+20);
			test.setTranslateY(SceneManager.SCENE_HEIGHT/2+30);
			gct.setFill(Color.BLACK);
			gct.setFont(stFont);
			gct.setTextBaseline(VPos.CENTER);
			gct.setTextAlign(TextAlignment.CENTER);
			gct.fillText("START", test.getWidth()/2, test.getHeight()/2);
			test.setOnMouseClicked(new EventHandler<Event>() {

				public void handle(Event event) {
					// TODO Auto-generated method stub
					Canvas canas = new Canvas(700,550);
					GraphicsContext gc = canas.getGraphicsContext2D();
					gc.setFill(Color.WHITE);
					gc.fillRect(0, 0, 700, 550);
				}
			});
			
			
			root.getChildren().add(main);
			root.getChildren().add(test);
			root.getChildren().add(testt);
			root.requestFocus();
			
			Scene scene = new Scene(root,700,550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			runAnimationTimer();
			
			primaryStage.setResizable(false);
			primaryStage.sizeToScene();
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void runAnimationTimer() {
		new AnimationTimer() {
			private long startTime ;
			private boolean isFirstFrame = true;
			private long limitTime = 120;
			@Override
			public void handle(long now) {
				if (isFirstFrame) {
					startTime = now;
					isFirstFrame = false;
				}
				double realTime = (now - startTime)/10e9;
				double countTime = (limitTime - realTime)/10e9;
				
				GraphicsContext gc = testt.getGraphicsContext2D();
				String timeString = String.format("Time : %.2fs", countTime);
				gc.setFill(Color.WHITE);
				gc.fillRect(0, 0, 300, 500);
				gc.setFill(Color.BLACK);
				gc.setFont(stFont);
				gc.setTextBaseline(VPos.CENTER);
				gc.setTextAlign(TextAlignment.CENTER);
				gc.fillText(timeString ,50,50);
				testt.setTranslateX(0);
				testt.setTranslateY(0);
			}
		}.start();
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println(Generator.getInstance().getRandomBev().toString());
	}
}
