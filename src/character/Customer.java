package character;

import java.util.Random;

import Menu.Beverage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Customer extends Entity {
	
	public enum state{
		waiting, left, walk;
	}
	private state currentState;
	private Image cusImage;
	private Beverage bev;
	private boolean isWaiting = true;
	public static final int IMG_WIDTH = 115 , IMG_HEIGHT = 125;
	//new boolean for check if isWaiting
	
	
	public Customer() {
		this.bev = Generator.getInstance().getRandomBev();
		this.cusImage = Generator.getInstance().getRandomImage();
		currentState = state.walk;
		//maybe initial state 
	}
	
	public boolean isWaiting() {
		if(this.isWaiting) return true;
		return false;
		//mai bok pai thum angggg
	}
	
	public String order() {
		//you may need this method
		return bev.getName();
	}
	

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(cusImage, 0, 0, IMG_WIDTH, IMG_HEIGHT);
	}
	
	public Image getCusImage() {
		return cusImage;
	}

	public void setCusImage(Image cusImage) {
		this.cusImage = cusImage;
	}

	public boolean getIsWaiting() {
		return this.isWaiting;
	}
	
	public Image getBevImg() {
		return this.bev.getBeverageImage();
	}
	
	public Image getBlenderImg() {
		return this.bev.getBlenderImage();
	}
	
	public Image getOrderImg() {
		return this.bev.getOrderImage();
	}
	
	public void setIsWaiting(boolean isWaiting) {
		this.isWaiting = isWaiting;
	}
}