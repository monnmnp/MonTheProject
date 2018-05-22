package Graphic;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class RecipeScene extends Pane {
	private Canvas recipeScene = new Canvas(SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
	private static final double BTN_WIDTH = 70,BTN_HEIGHT = 70;
	
	public RecipeScene() {
		GraphicsContext gc = recipeScene.getGraphicsContext2D();
		gc.drawImage(ResImage.recipe, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
		getChildren().add(recipeScene);
		
		Canvas playBtn = getdrawBtn(ResImage.playR);
		setTranslate(playBtn, 0, 630);
		addCanvasEvent(playBtn);
		
		getChildren().add(playBtn);
	}
	public Canvas getdrawBtn(Image img) {
		Canvas canvas = new Canvas(BTN_WIDTH, BTN_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
		return canvas;
	}
	
	public void drawBtn(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	public void drawBoard(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	private void addCanvasEvent(Canvas canvas){
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
				drawBoard(canvas, ResImage.playP);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas, ResImage.playR);
			}
			
		});
	}
}
