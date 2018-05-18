package Graphic;

import javafx.animation.AnimationTimer;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class GameStage {
	private Font gFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 40);
	public Canvas test = new Canvas(100,100);
	
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
				double realTime = (now - startTime);
				double countTime = limitTime - realTime;

					GraphicsContext gc = test.getGraphicsContext2D();
					String timeString = String.format("Time : %.2fs", realTime);
					gc.setFill(Color.BLACK);
					gc.setFont(gFont);
					gc.setTextBaseline(VPos.CENTER);
					gc.setTextAlign(TextAlignment.CENTER);
					gc.fillText(timeString ,50,50);
			}
		}.start();
	}
}
