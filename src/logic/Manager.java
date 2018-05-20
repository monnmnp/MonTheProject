package logic;

import character.Customer;
import javafx.animation.AnimationTimer;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Manager {
	
	
	public void updateCustomer() {
		Holder.getInstance().getCustomers().removeIf(e -> {
			return false;
		});
		while(Holder.getInstance().getCustomers().size() < 6) {
			Holder.getInstance().getCustomers().add(new Customer());
			
		}
		
	}
	public void startGame() {
		// 
		// 
		// Fighting na krub !! :D 
		//  Miss you jang loeyyyyy <3
		//
		//			from someone you already known.
		//
		runAnimationTimer();
	}
	
	public void gameUpdate() { //update game in every time unit
		updateCustomer();
	}
	
	public boolean isLose() { 
		return false;
	}
	
	public void gameOver() {
		// do something when game over
	}
	
	public boolean serve(Customer customer) {
		return false;
		//do something when click at customer
		//serve the wrong person --> do something
		//serve the right person --> do something
	}
	
	public void runAnimationTimer() {
		new AnimationTimer() {
			private long startTime ;
			private boolean isFirstFrame = true;
			private long limitTime = 120;
			public Canvas testt = new Canvas(300,100);
			private Font timeFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 25);
			@Override
			public void handle(long now) {
				if (isFirstFrame) {
					startTime = now;
					isFirstFrame = false;
				}
				double realTime = (now - startTime)/1.0e9;
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
				
				gameUpdate();
			}
		}.start();
	}
}
