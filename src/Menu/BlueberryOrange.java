package Menu;

public class BlueberryOrange extends Beverage {
	public BlueberryOrange() {
		this.setName("BlueberryOrange");
		this.setPrice(20);
		Ingredient blueberry = new Blueberry();
		Ingredient orange = new Orange();
		Ingredient yogurt = new Yogurt();
		this.addIngredient(blueberry);
		this.addIngredient(orange);
		this.addIngredient(yogurt);
	}
}
