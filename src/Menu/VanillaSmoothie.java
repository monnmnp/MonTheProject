package Menu;

public class VanillaSmoothie extends Beverage {
	public VanillaSmoothie() {
		this.setName("VanillaSmoothie");
		this.setPrice(10);
		Ingredient vanilla = new Vanilla();
		Ingredient honey = new Honey();
		Ingredient milk = new Milk();
		this.addIngredient(vanilla);
		this.addIngredient(honey);
		this.addIngredient(milk);
	}
}
