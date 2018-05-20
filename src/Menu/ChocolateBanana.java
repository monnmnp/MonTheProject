package Menu;

public class ChocolateBanana extends Beverage {
	public ChocolateBanana() {
		this.setName("ChocolateBanana");
		this.setPrice(35);
		Ingredient chocolate = new Chocolate();
		Ingredient banana = new Banana();
		Ingredient milk = new Milk();
		this.addIngredient(chocolate);
		this.addIngredient(banana);
		this.addIngredient(milk);
	}
}
