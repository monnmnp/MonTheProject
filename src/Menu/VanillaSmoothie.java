package Menu;

import Graphic.ResImage;

public class VanillaSmoothie extends Beverage {
	public VanillaSmoothie() {
		this.setName("VanillaSmoothie");
		this.setBeverageImage(ResImage.vanillaBev);
		this.setBlenderImage(ResImage.blendVM);
		this.setOrderImage(ResImage.vanillaOrder);
		Ingredient vanilla = new Vanilla();
		Ingredient honey = new Honey();
		Ingredient milk = new Milk();
		this.addIngredient(vanilla);
		this.addIngredient(honey);
		this.addIngredient(milk);
	}
}
