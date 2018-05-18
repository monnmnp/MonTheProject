package Menu;

public class VanillaSmoothie extends Beverage {
	public VanillaSmoothie() {
		this.setName("VanillaSmoothie");
		this.setPrice(10);
		Ingredient vanilla = new Vanilla();
		Ingredient milk = new Milk();
		this.addIngredient(vanilla);
		this.addIngredient(vanilla);
		this.addIngredient(milk);
	}
}
