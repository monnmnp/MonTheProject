package Graphic;

import javafx.scene.image.Image;

public class ResImage {
	public static Image artist,astronaut,businessman,detective,doctor;
	public static Image dragcular,elf,engineer,fireman,bride,soilder,pilot,scientist,wizzard,zombie;
	public static Image blueberry,strawberry,cherry,nut,milk,yogurt,vanilla,chocolate,orange,banana,honey;
	public static Image mainBG,mixBar,resultBG;
	public static Image blueOrder, chobaOrder, chocOrder, strawbaOrder, strawshortOrder, vanillaOrder;
	public static Image blueBev, chobaBev, chocBev, strawbaBev, strawshortBev, vanillaBev;
	public static Image blender,blender2,playR,playP;
	public static Image replayd,replayb,bin,human,recipe,recipeBtn;
	public static Image blendBY,blendCB,blendCH,blendSB,blendSS,blendVM;
	
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
		resultBG = new Image(ClassLoader.getSystemResource("scene/restbg.png").toString());
		recipe = new Image(ClassLoader.getSystemResource("scene/Pim-02.jpg").toString());
		recipeBtn = new Image(ClassLoader.getSystemResource("ingre/book-flat.png").toString());
		
		blueOrder = new Image(ClassLoader.getSystemResource("bev/Blue bubble.png").toString());
		chobaOrder = new Image(ClassLoader.getSystemResource("bev/choba bubble.png").toString());
		chocOrder = new Image(ClassLoader.getSystemResource("bev/choc bubble.png").toString());
		strawbaOrder = new Image(ClassLoader.getSystemResource("bev/strawba bubble.png").toString());
		strawshortOrder = new Image(ClassLoader.getSystemResource("bev/strawshort bubble.png").toString());
		vanillaOrder = new Image(ClassLoader.getSystemResource("bev/vanilla bubble.png").toString());
		
		blueBev = new Image(ClassLoader.getSystemResource("bev/Blue.png").toString());
		chobaBev = new Image(ClassLoader.getSystemResource("bev/choba.png").toString());
		chocBev = new Image(ClassLoader.getSystemResource("bev/choc.png").toString());
		strawbaBev = new Image(ClassLoader.getSystemResource("bev/strawba.png").toString());
		strawshortBev = new Image(ClassLoader.getSystemResource("bev/strawshort.png").toString());
		vanillaBev = new Image(ClassLoader.getSystemResource("bev/vanilla.png").toString());
		
		blender = new Image(ClassLoader.getSystemResource("etc/blender2.png").toString());
		blender2 = new Image(ClassLoader.getSystemResource("etc/blendereiei.png").toString());
		
		playR = new Image(ClassLoader.getSystemResource("etc/playR.png").toString());
		playP = new Image(ClassLoader.getSystemResource("etc/playP.png").toString());
		
		replayb = new Image(ClassLoader.getSystemResource("etc/replayb.png").toString()); 
		replayd = new Image(ClassLoader.getSystemResource("etc/replayd.png").toString()); 
		bin = new Image(ClassLoader.getSystemResource("etc/binn.png").toString());
		human = new Image(ClassLoader.getSystemResource("etc/human.png").toString());
		
		blendBY = new Image(ClassLoader.getSystemResource("gif/BY_blender.gif").toString());
		blendCB = new Image(ClassLoader.getSystemResource("gif/CB_blender.gif").toString());
		blendCH = new Image(ClassLoader.getSystemResource("gif/CH_blender.gif").toString());
		blendSB = new Image(ClassLoader.getSystemResource("gif/SB_blender.gif").toString());
		blendSS = new Image(ClassLoader.getSystemResource("gif/SS_blender.gif").toString());
		blendVM = new Image(ClassLoader.getSystemResource("gif/VM_blender.gif").toString());
		
	}
}
