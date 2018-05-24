package Menu;

import javafx.scene.image.Image;

public class Ingredient {
	private String name;
	private Image image;
	private boolean isPick = false;
	public Ingredient() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPick() {
		return isPick;
	}
	public void setPick(boolean isPick) {
		this.isPick = isPick;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
}
