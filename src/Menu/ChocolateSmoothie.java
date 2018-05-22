package Menu;

import Graphic.ResImage;

public class ChocolateSmoothie extends Beverage {
	public ChocolateSmoothie() {
		super.setName("ChocolateSmoothie");
		super.setPrice(10);
		this.setBeverageImage(ResImage.chocBev);
		Ingredient chocolate = new Chocolate();
		Ingredient milk = new Milk();
		this.addIngredient(chocolate);
		this.addIngredient(chocolate);
		this.addIngredient(milk);
	}
}
