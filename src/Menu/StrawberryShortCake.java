package Menu;

public class StrawberryShortCake extends Beverage {
	public StrawberryShortCake() {
		this.setName("StrawberryShortCake");
		this.setPrice(10);
		Ingredient strawberry = new Strawberry();
		Ingredient vanilla = new Vanilla();
		Ingredient milk = new Milk();
		this.addIngredient(strawberry);
		this.addIngredient(vanilla);
		this.addIngredient(milk);
	}
}
