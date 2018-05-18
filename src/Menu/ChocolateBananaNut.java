package Menu;

public class ChocolateBananaNut extends Beverage {
	public ChocolateBananaNut() {
		this.setName("ChocolateBananaNut");
		this.setPrice(35);
		Ingredient chocolate = new Chocolate();
		Ingredient banana = new Banana();
		Ingredient nut = new Nut();
		this.addIngredient(chocolate);
		this.addIngredient(banana);
		this.addIngredient(nut);
	}
}
