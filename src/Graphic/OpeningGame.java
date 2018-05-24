package Graphic;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class OpeningGame extends Pane {
	private Canvas main = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private Font nameFont  = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/impact.ttf"), 85);
	private Font pBtnFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	private Canvas playBtn = new Canvas(200,90);
	
	public OpeningGame() {
		GraphicsContext gc = main.getGraphicsContext2D();
		ResImage.titleS.setVolume(2);
		ResImage.titleS.play();
		gc.drawImage(ResImage.mainBG, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
		gc.setFont(nameFont);
		gc.setFill(Color.DARKRED);
		gc.setTextBaseline(VPos.CENTER);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("SMOOTHIES\nGUY", SceneManager.SCENE_WIDTH/2, SceneManager.SCENE_HEIGHT/3);
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(2);
		gc.strokeText("SMOOTHIES\nGUY", SceneManager.SCENE_WIDTH/2, SceneManager.SCENE_HEIGHT/3);
		
		
		drawBtn(playBtn);
		addCanvasEvent(playBtn);
		
		getChildren().add(main);
		getChildren().add(playBtn);
	}
	
	private void drawBtn(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(100, 100, 100));
		gc.fillRoundRect(0, 0, 200, 90, 30, 30);
		setTranslate(canvas, SceneManager.SCENE_WIDTH/3+20, SceneManager.SCENE_HEIGHT/2+30);
		gc.setFill(Color.BLACK);
		gc.setFont(pBtnFont);
		gc.setTextBaseline(VPos.CENTER);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("PLAY", canvas.getWidth()/2, canvas.getHeight()/2);
	
	}
	
	private void undrawBtn(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(200, 200, 200));
		gc.fillRoundRect(0, 0, 200, 90, 30, 30);
		setTranslate(canvas, SceneManager.SCENE_WIDTH/3+20, SceneManager.SCENE_HEIGHT/2+30);
		gc.setFill(Color.BLACK);
		gc.setFont(pBtnFont);
		gc.setTextBaseline(VPos.CENTER);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("PLAY", canvas.getWidth()/2, canvas.getHeight()/2);
		
	}
	
	private void addCanvasEvent(Canvas canvas ) {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				ResImage.buttonS.play();
				ResImage.titleS.stop();
				SceneManager.goToGameScene();
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				undrawBtn(canvas);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas);
			}
		});
	}
	
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	
}
