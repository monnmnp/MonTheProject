package character;

import java.util.Random;

import Menu.Beverage;
import javafx.scene.image.Image;

public class Customer extends Person {
	private double mood;
	private Image cusImage;
	private Beverage bev;
	public Customer() {
		this.bev = Generator.getInstance().getRandomBev();
		this.cusImage = Generator.getInstance().getRandomImage();
		mood = new Random().nextDouble()*100 ; 
	}
}
