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
	private Font nameFont  = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/hotpizza.ttf"), 55);
	private Font stFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	
	public OpeningGame() {
		
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
		
		getChildren().add(main);
		
		Canvas stBtn = new Canvas(200,90);
		undrawBtn(stBtn);
		addCanvasEvent(stBtn);
		
		getChildren().add(stBtn);
		addCanvasEvent(stBtn);
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
				SceneManager.goToGameScene();
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				undrawBtn(canvas);
			}
		});
	}
	
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	
}
