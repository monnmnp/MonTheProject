package Graphic;

import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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
		GraphicsContext gcStBtn = stBtn.getGraphicsContext2D();
		gcStBtn.setFill(Color.rgb(20, 20, 20, 0.5));
		
		gcStBtn.setFill(Color.rgb(200, 200, 200, 0.9));
		gcStBtn.fillRoundRect(0, 0, 200, 90, 30, 30);
		stBtn.setTranslateX(SceneManager.SCENE_WIDTH/3+20);
		stBtn.setTranslateY(SceneManager.SCENE_HEIGHT/2+30);
		gcStBtn.setFill(Color.BLACK);
		gcStBtn.setFont(stFont);
		gcStBtn.setTextBaseline(VPos.CENTER);
		gcStBtn.setTextAlign(TextAlignment.CENTER);
		gcStBtn.fillText("START", stBtn.getWidth()/2, stBtn.getHeight()/2);
		
		getChildren().add(stBtn);
		
	}
}
