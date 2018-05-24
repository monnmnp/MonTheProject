package Menu;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Beverage {
	private String name;
	private Image beverageImage,blenderImage,orderImage;
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	
	public Image getOrderImage() {
		return orderImage;
	}

	public void setOrderImage(Image orderImage) {
		this.orderImage = orderImage;
	}

	public Image getBlenderImage() {
		return blenderImage;
	}

	public void setBlenderImage(Image blenderImage) {
		this.blenderImage = blenderImage;
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
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	

}