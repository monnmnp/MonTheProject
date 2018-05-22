package Menu;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Beverage {
	private int price;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private boolean isRight;
	private Image beverageImage;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	public Beverage() {
	}
	
	public Image getBeverageImage() {
		return beverageImage;
	}
	
	public void setBeverageImage(Image beverageImage) {
		this.beverageImage = beverageImage;
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public boolean isRight() {
		return isRight;
	}
	
	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		String s = "";
		for(Ingredient x:ingredients) {
			s += x.getName() + " \n";
		}
		return s;
	}
	
	public boolean equal(Beverage other) {
		if(this.toString() == other.toString()) return true;
		return false;
	}
}