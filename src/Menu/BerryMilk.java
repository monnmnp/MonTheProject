package Menu;

public class BerryMilk extends Beverage{
	public BerryMilk() {
		super.setName("BerryMilk");
		super.setPrice(30);
		Ingredient blueberry = new Blueberry();
		Ingredient strawberry = new Strawberry();
		Ingredient milk = new Milk();
		this.addIngredient(blueberry);
		this.addIngredient(strawberry);
		this.addIngredient(milk);
	}
}
