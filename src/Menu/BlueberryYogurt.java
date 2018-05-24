package Menu;

import Graphic.ResImage;
import javafx.scene.image.Image;

public class BlueberryYogurt extends Beverage {
	public BlueberryYogurt() {
		this.setName("BlueberryYogurt");
		this.setBeverageImage(ResImage.blueBev);
		this.setBlenderImage(ResImage.blendBY);
		this.setOrderImage(ResImage.blueOrder);
		Ingredient blueberry = new Blueberry();
		Ingredient yogurt = new Yogurt();
		Ingredient milk = new Milk();
		this.addIngredient(blueberry);
		this.addIngredient(yogurt);
		this.addIngredient(milk);
	}
}
