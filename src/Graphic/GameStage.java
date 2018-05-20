package Graphic;

import javafx.animation.AnimationTimer;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class GameStage extends Pane {
	private Font gFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	public Canvas gameStage = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private static final double BTN_WIDTH = 70,BTN_HEIGHT = 70;
	
	
	public GameStage() {
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
		
		getChildren().add(gameStage);
		getChildren().addAll(blueberryBtn,strawberryBtn,chocolateBtn,vanillaBtn);
		getChildren().addAll(bananaBtn,milkBtn,yogurtBtn,honeyBtn);
		
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

}
