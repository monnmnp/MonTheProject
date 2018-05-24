package Menu;

import Graphic.ResImage;

public class StrawberryShortCake extends Beverage {
	public StrawberryShortCake() {
		this.setName("StrawberryShortCake");
		this.setBeverageImage(ResImage.strawshortBev);
		this.setBlenderImage(ResImage.blendSS);
		this.setOrderImage(ResImage.strawshortOrder);
		Ingredient strawberry = new Strawberry();
		Ingredient vanilla = new Vanilla();
		Ingredient milk = new Milk();
		this.addIngredient(strawberry);
		this.addIngredient(vanilla);
		this.addIngredient(milk);
	}
}
