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
import logic.Holder;

public class ScoreBoard extends Pane{
	Canvas scoreBoard = new Canvas(SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
	private Font scoreFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/impact.ttf"), 50);
	private static int BTN_WIDTH = 220,BTN_HEIGHT = 80;
	Canvas replayBtn = new Canvas(BTN_WIDTH, BTN_HEIGHT);
	
	public ScoreBoard() {
		GraphicsContext gc = scoreBoard.getGraphicsContext2D();
		gc.drawImage(ResImage.resultBG, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
		
		gc.setFill(Color.rgb(250, 215, 128, 0.9));
		gc.fillRoundRect(60, 60, 580, 250, 25, 25);
		gc.setFill(Color.BROWN);
		gc.setFont(scoreFont);
		gc.setTextBaseline(VPos.CENTER);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("Result", SceneManager.SCENE_WIDTH/2, 100);
		String scoreString = String.format("sCORE : %.0f ", Holder.getInstance().getScore());
		gc.fillText(scoreString, SceneManager.SCENE_WIDTH/2, 200 );
		
		drawBtn(replayBtn);
		addCanvasEvent(replayBtn);
		
		getChildren().add(scoreBoard);
		getChildren().add(replayBtn);
	}
	
	private void drawBtn(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		setTranslate(canvas, 240, 330);
		gc.drawImage(ResImage.replayd, 0, 0, BTN_WIDTH, BTN_HEIGHT);

	}
	private void undrawBtn(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		setTranslate(canvas, 240, 330);
		gc.drawImage(ResImage.replayb, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	private void addCanvasEvent(Canvas canvas ) {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				SceneManager.gotoOpeningGame();
				Holder.getInstance().getScoreBoard().getChildren().clear();
				Holder.getInstance().createScoreBoard();
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
}
