package Menu;

public class ChocolateSmoothie extends Beverage {
	public ChocolateSmoothie() {
		super.setName("ChocolateSmoothie");
		super.setPrice(10);
		Ingredient chocolate = new Chocolate();
		Ingredient milk = new Milk();
		this.addIngredient(chocolate);
		this.addIngredient(chocolate);
		this.addIngredient(milk);
	}
}
