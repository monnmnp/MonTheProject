package Character;

import java.util.Random;

import Menu.Beverage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Customer {
	private Image cusImage;
	private Beverage beverage;
	private boolean isWaiting;
	public static final int IMG_WIDTH = 115 , IMG_HEIGHT = 125;
	
	
	public Customer() {
		this.beverage = Generator.getInstance().getRandomBev();
		this.cusImage = Generator.getInstance().getRandomImage();
		this.isWaiting = true;
	}
	
	public String order() {
		return beverage.getName();
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
	
	public void setIsWaiting(boolean isWaiting) {
		this.isWaiting = isWaiting;
	}
	
	public Image getBevImg() {
		return this.beverage.getBeverageImage();
	}
	
	public Image getBlenderImg() {
		return this.beverage.getBlenderImage();
	}
	
	public Image getOrderImg() {
		return this.beverage.getOrderImage();
	}
	
}