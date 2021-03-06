package Menu;

import Graphic.ResImage;

public class StrawberryBanana extends Beverage {
	public StrawberryBanana() {
		this.setName("StrawberryBanana");
		this.setBeverageImage(ResImage.strawbaBev);
		this.setBlenderImage(ResImage.blendSB);
		this.setOrderImage(ResImage.strawbaOrder);
		Ingredient strawberry = new Strawberry();
		Ingredient banana = new Banana();
		Ingredient milk = new Milk();
		this.addIngredient(strawberry);
		this.addIngredient(banana);
		this.addIngredient(milk);
	}
}
