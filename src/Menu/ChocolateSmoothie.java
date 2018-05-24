package Menu;

import Graphic.ResImage;

public class ChocolateSmoothie extends Beverage {
	public ChocolateSmoothie() {
		this.setName("ChocolateSmoothie");
		this.setBeverageImage(ResImage.chocBev);
		this.setBlenderImage(ResImage.blendCH);
		this.setOrderImage(ResImage.chocOrder);
		Ingredient chocolate = new Chocolate();
		Ingredient milk = new Milk();
		this.addIngredient(chocolate);
		this.addIngredient(chocolate);
		this.addIngredient(milk);
	}
}
