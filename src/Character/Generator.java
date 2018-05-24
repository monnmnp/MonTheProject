package Character;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import Graphic.ResImage;
import Menu.Beverage;
import Menu.BlueberryYogurt;
import Menu.ChocolateBanana;
import Menu.ChocolateSmoothie;
import Menu.StrawberryBanana;
import Menu.StrawberryShortCake;
import Menu.VanillaSmoothie;
import javafx.scene.image.Image;

public class Generator {
	private static Generator singleton = new Generator();
	public List<Beverage> beverages;
	public List<Image> images;
	private Generator() {
		initialBev();
		initialImage();
	}
	public void initialBev() {
		beverages = new ArrayList<Beverage>();
		beverages.add(new BlueberryYogurt());
		beverages.add(new ChocolateBanana());
		beverages.add(new StrawberryShortCake());
		beverages.add(new ChocolateSmoothie());
		beverages.add(new VanillaSmoothie());
		beverages.add(new StrawberryBanana());
	}
	public void initialImage() {
		images = new ArrayList<Image>();
		images.add(ResImage.artist);
		images.add(ResImage.astronaut);
		images.add(ResImage.bride);
		images.add(ResImage.businessman);
		images.add(ResImage.detective);
		images.add(ResImage.doctor);
		images.add(ResImage.dragcular);
		images.add(ResImage.elf);
		images.add(ResImage.engineer);
		images.add(ResImage.fireman);
		images.add(ResImage.pilot);
		images.add(ResImage.scientist);
		images.add(ResImage.soilder);
		images.add(ResImage.wizzard);
		images.add(ResImage.zombie);
	}
	
	public Beverage getRandomBev() {
		Random random = new Random();
		return beverages.get(random.nextInt(beverages.size()));
	}
	public Image getRandomImage() {
		Random random = new Random();
		return images.get(random.nextInt(images.size()));
	}
	public static Generator getInstance() {
		return singleton;
	}
}