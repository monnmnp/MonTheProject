package Menu;

import Graphic.ResImage;
import javafx.scene.image.Image;

public class BlueberryYogurt extends Beverage {
	public BlueberryYogurt() {
		super.setPrice(15);
		super.setName("BlueberryYogurt");
		super.setBeverageImage(ResImage.blueBev);
		Ingredient blueberry = new Blueberry();
		Ingredient yogurt = new Yogurt();
		Ingredient milk = new Milk();
		this.addIngredient(blueberry);
		this.addIngredient(yogurt);
		this.addIngredient(milk);
	}
}
