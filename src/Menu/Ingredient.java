package Menu;

import javafx.scene.image.Image;

public class Ingredient {
	protected String color;
	protected String name;
	protected Image image;
	public Ingredient() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
}
