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
	private Canvas main = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private Font nameFont  = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/hotpizza.ttf"), 80);
	private Font stFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	private Font timeFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 25);
	public Canvas testt = new Canvas(200,60);
	Pane gm = new Pane();
	public Canvas gameStage = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private static final double BTN_WIDTH = 70,BTN_HEIGHT = 70;
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
			undrawBtn(test);
			addCanvasEvent(test);
			test.setFocusTraversable(true);
			
			
			root.getChildren().add(main);
			root.getChildren().add(test);
			root.getChildren().add(testt);
			root.requestFocus();
			
			Scene scene = new Scene(gm,700,550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			runAnimationTimer();
			GameStagee();
			gm.getChildren().add(testt);
			primaryStage.setResizable(false);
			primaryStage.sizeToScene();
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void drawBtn(Canvas canvas) {
		GraphicsContext gcStBtn = canvas.getGraphicsContext2D();
		gcStBtn.setFill(Color.rgb(200, 200, 200, 1.0));
		gcStBtn.fillRoundRect(0, 0, 200, 90, 30, 30);
		canvas.setTranslateX(SceneManager.SCENE_WIDTH/3+20);
		canvas.setTranslateY(SceneManager.SCENE_HEIGHT/2+30);
		gcStBtn.setFill(Color.BLACK);
		gcStBtn.setFont(stFont);
		gcStBtn.setTextBaseline(VPos.CENTER);
		gcStBtn.setTextAlign(TextAlignment.CENTER);
		gcStBtn.fillText("START", canvas.getWidth()/2, canvas.getHeight()/2);
		

	}
	private void undrawBtn(Canvas canvas) {
		GraphicsContext gcStBtn = canvas.getGraphicsContext2D();
		gcStBtn.setFill(Color.rgb(100, 100, 100, 1.0));
		gcStBtn.fillRoundRect(0, 0, 200, 90, 30, 30);
		canvas.setTranslateX(SceneManager.SCENE_WIDTH/3+20);
		canvas.setTranslateY(SceneManager.SCENE_HEIGHT/2+30);
		gcStBtn.setFill(Color.BLACK);
		gcStBtn.setFont(stFont);
		gcStBtn.setTextBaseline(VPos.CENTER);
		gcStBtn.setTextAlign(TextAlignment.CENTER);
		gcStBtn.fillText("START", canvas.getWidth()/2, canvas.getHeight()/2);
		

	}
	private void addCanvasEvent(Canvas canvas ) {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				System.out.println("kiki");
				SceneManager.goToGameScene();
			}
		});
		canvas.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				drawBtn(canvas);
			}
		});
		canvas.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				undrawBtn(canvas);
			}
		});
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
				double realTime = (now - startTime)/1.0e0;
				double countTime = (limitTime - realTime);
				
				if(realTime >= limitTime) this.stop();
				GraphicsContext gc = testt.getGraphicsContext2D();
				String timeString = String.format("Time : %.0f s", countTime);
				gc.setFill(Color.WHITESMOKE);
				gc.fillRect(0, 0, testt.getWidth(), testt.getHeight());
				gc.setFill(Color.BLACK);
				gc.setFont(timeFont);
				gc.setTextBaseline(VPos.CENTER);
				gc.setTextAlign(TextAlignment.CENTER);
				gc.fillText(timeString ,testt.getWidth()/2, testt.getHeight()/2);
				testt.setTranslateX(0);
				testt.setTranslateY(0);
			}
		}.start();
	}
	
	public void GameStagee() {
		ResImage.loadResource();
		Canvas barMix = new Canvas(700,550);
		GraphicsContext gc = gameStage.getGraphicsContext2D();
		gc.drawImage(ResImage.mixBar, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
		
		Canvas blueberryBtn = getdrawBtn(ResImage.blueberry);
		setTranslate(blueberryBtn, 20, 330);
		blueberryBtn.setFocusTraversable(true);
		addOnCanvasEvent(blueberryBtn, ResImage.blueberry);
		
		Canvas strawberryBtn = getdrawBtn(ResImage.strawberry);
		setTranslate(strawberryBtn, BTN_WIDTH+20, 330);
		strawberryBtn.setFocusTraversable(true);
		addOnCanvasEvent(strawberryBtn, ResImage.strawberry);
		
		Canvas chocolateBtn = getdrawBtn(ResImage.chocolate);
		setTranslate(chocolateBtn, BTN_WIDTH*2+20, 330);
		chocolateBtn.setFocusTraversable(true);
		addOnCanvasEvent(chocolateBtn , ResImage.chocolate);
		
		Canvas vanillaBtn  = getdrawBtn(ResImage.vanilla);
		setTranslate(vanillaBtn, BTN_WIDTH*3+20, 330);
		vanillaBtn.setFocusTraversable(true);
		addOnCanvasEvent(vanillaBtn, ResImage.vanilla);
		
		Canvas bananaBtn = getdrawBtn(ResImage.banana);
		setTranslate(bananaBtn, BTN_WIDTH*4+20, 330);
		bananaBtn.setFocusTraversable(true);
		addOnCanvasEvent(bananaBtn, ResImage.banana);
		
		Canvas milkBtn = getdrawBtn(ResImage.milk);
		setTranslate(milkBtn, BTN_WIDTH*5+20, 330);
		milkBtn.setFocusTraversable(true);
		addOnCanvasEvent(milkBtn, ResImage.milk);
		
		Canvas yogurtBtn = getdrawBtn(ResImage.yogurt);
		setTranslate(yogurtBtn, BTN_WIDTH*6+20, 330);
		addOnCanvasEvent(yogurtBtn, ResImage.yogurt);
		
		Canvas honeyBtn = getdrawBtn(ResImage.honey);
		setTranslate(honeyBtn, BTN_WIDTH*7+20, 330);
		addOnCanvasEvent(honeyBtn, ResImage.honey);
		
		gm.getChildren().add(gameStage);
		gm.getChildren().addAll(blueberryBtn,strawberryBtn,chocolateBtn,vanillaBtn);
		gm.getChildren().addAll(bananaBtn,milkBtn,yogurtBtn,honeyBtn);
		
	}
	
	public Canvas getdrawBtn(Image img) {
		Canvas canvas = new Canvas(BTN_WIDTH, BTN_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(252, 220, 116));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
		return canvas;
	}
	
	public void drawBtn(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(252, 220, 116));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	public void drawBoard(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(250, 245, 178));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	private void addOnCanvasEvent(Canvas canvas,Image img) {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBoard(canvas, img);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas, img);
			}
			
		});
	}
	
	public static void main(String[] args) {
		launch(args);
		System.out.println(Generator.getInstance().getRandomBev().toString());
	}
}
