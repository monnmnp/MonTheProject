package Menu;

public class CherrySmoothie extends Beverage {
	public CherrySmoothie() {
		this.setName("CherrySmoothie");
		this.setPrice(20);
		Ingredient cherry = new Cherry();
		Ingredient honey = new Honey();
		Ingredient yogurt = new  Yogurt();
		this.addIngredient(cherry);
		this.addIngredient(honey);
	}
}
