package character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Graphic.ResImage;
import Menu.BerryMilk;
import Menu.Beverage;
import Menu.BlueberryOrange;
import Menu.BlueberryYogurt;
import Menu.CherrySmoothie;
import Menu.CherryVanilla;
import Menu.ChocolateBananaNut;
import Menu.ChocolateSmoothie;
import Menu.StrawberryBanana;
import Menu.StrawberryShortCake;
import Menu.VanillaSmoothie;
import javafx.scene.image.Image;

public class Generator {
	private static Generator singleton = new Generator();
	public List<Customer> customers;
	public List<Beverage> beverages;
	public List<Image> images;
	public void initialBev() {
		beverages = new ArrayList<Beverage>();
		beverages.add(new BerryMilk() );
		beverages.add(new BlueberryOrange());
		beverages.add(new BlueberryYogurt());
		beverages.add(new CherrySmoothie());
		beverages.add(new CherryVanilla());
		beverages.add(new ChocolateBananaNut());
		beverages.add(new ChocolateSmoothie());
		beverages.add(new StrawberryBanana());
		beverages.add(new StrawberryShortCake());
		beverages.add(new VanillaSmoothie());
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
	private Generator() {
		initialBev();
	}
	public Beverage getRandomBev() {
		Random random = new Random();
		return beverages.get(random.nextInt(10));
	}
	public Image getRandomImage() {
		Random random = new Random();
		return images.get(random.nextInt(15));
	}
	public static Generator getInstance() {
		return singleton;
	}
}
