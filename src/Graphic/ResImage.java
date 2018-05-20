package Graphic;

import javafx.scene.image.Image;

public class ResImage {
	public static Image artist,astronaut,businessman,detective,doctor;
	public static Image dragcular,elf,engineer,fireman,bride,soilder,pilot,scientist,wizzard,zombie;
	public static Image blueberry,strawberry,cherry,nut,milk,yogurt,vanilla,chocolate,orange,banana,honey;
	public static Image mainBG,mixBar;
	
	public static void loadResource() {
		
		artist = new Image(ClassLoader.getSystemResource("image/art.png").toString());
		astronaut = new Image(ClassLoader.getSystemResource("image/astro.png").toString());
		businessman = new Image(ClassLoader.getSystemResource("image/business.png").toString());
		detective = new Image(ClassLoader.getSystemResource("image/detective.png").toString());
		doctor = new Image(ClassLoader.getSystemResource("image/doctor.png").toString());
		dragcular = new Image(ClassLoader.getSystemResource("image/drag.png").toString());
		elf = new Image(ClassLoader.getSystemResource("image/elf.png").toString());
		engineer = new Image(ClassLoader.getSystemResource("image/engineer.png").toString());
		fireman = new Image(ClassLoader.getSystemResource("image/firewoman.png").toString());
		bride = new Image(ClassLoader.getSystemResource("image/jaosao.png").toString());
		soilder = new Image(ClassLoader.getSystemResource("image/nutcraker.png").toString());
		pilot = new Image(ClassLoader.getSystemResource("image/pilot.png").toString());
		scientist = new Image(ClassLoader.getSystemResource("image/sci.png").toString());
		wizzard = new Image(ClassLoader.getSystemResource("image/wizzard.png").toString());
		zombie = new Image(ClassLoader.getSystemResource("image/zomby.png").toString());
		
		blueberry = new Image(ClassLoader.getSystemResource("ingre/blueberries.png").toString());
		strawberry = new Image(ClassLoader.getSystemResource("ingre/Strawberry.png").toString());
		milk = new Image(ClassLoader.getSystemResource("ingre/milk2.png").toString());
		yogurt = new Image(ClassLoader.getSystemResource("ingre/yogurt.png").toString());
		chocolate = new Image(ClassLoader.getSystemResource("ingre/chocolate_bar.png").toString());
		vanilla = new Image(ClassLoader.getSystemResource("ingre/vanilla.png").toString());
		banana = new Image(ClassLoader.getSystemResource("ingre/banana.png").toString());
		honey = new Image(ClassLoader.getSystemResource("ingre/honey.png").toString());
		
		mainBG = new Image(ClassLoader.getSystemResource("scene/build.jpg").toString());
		mixBar = new Image(ClassLoader.getSystemResource("scene/Pim-01.jpg").toString());
		
	}
}
