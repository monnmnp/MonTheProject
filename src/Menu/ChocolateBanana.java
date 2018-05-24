package Menu;

import Graphic.ResImage;

public class ChocolateBanana extends Beverage {
	public ChocolateBanana() {
		this.setName("ChocolateBanana");
		this.setBeverageImage(ResImage.chobaBev);
		this.setBlenderImage(ResImage.blendCB);
		this.setOrderImage(ResImage.chobaOrder);
		Ingredient chocolate = new Chocolate();
		Ingredient banana = new Banana();
		Ingredient milk = new Milk();
		this.addIngredient(chocolate);
		this.addIngredient(banana);
		this.addIngredient(milk);
	}
}
