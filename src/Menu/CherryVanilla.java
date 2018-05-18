package Menu;

public class CherryVanilla extends Beverage {
	public CherryVanilla() {
		this.setName("CherryVanilla");
		this.setPrice(25);
		Ingredient cherry = new Cherry();
		Ingredient vanilla = new Vanilla();
		Ingredient milk = new Milk();
		this.addIngredient(cherry);
		this.addIngredient(vanilla);
		this.addIngredient(milk);
	}
}
