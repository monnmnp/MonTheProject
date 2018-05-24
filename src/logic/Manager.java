package logic;

import Character.Customer;
import Character.Generator;
import Graphic.ResImage;
import Graphic.SceneManager;
import Menu.Ingredient;
import javafx.animation.AnimationTimer;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Manager {
	public static Manager instance = new Manager();
	private int ingedients[][] = {{1,0,0,0,0,1,1,0},{0,0,1,0,1,1,0,0}, {0,1,0,0,0,1,0,1}, {0,0,1,0,0,1,0,1}, {0,0,0,1,0,1,0,1}, {0,1,0,0,1,1,0,0}};
	private long limitTime = 120;
	private Canvas timerCV = new Canvas(200,80);
	private Font timeFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/queen.otf"), 25);
	private long startTime ;
	private boolean isFirstFrame = true;
	
	public static Manager getInstance() {
		return instance;
	}
	
	public void updateCustomer() {
		Holder.getInstance().getCustomers().removeIf(e -> {
			return !e.getIsWaiting();
		});
		while(Holder.getInstance().getCustomers().size() < 6) {
			Holder.getInstance().getCustomers().add(new Customer());
		}
//		for(Customer i : Holder.getInstance().getCustomers()) {
//			System.out.println(i.order());
//		}
	}
	public void startGame() {
		
		Generator.getInstance().initialBev();
		Generator.getInstance().initialImage();
		runAnimationTimer();
	}
	
	public void gameUpdate() { //update game in every time unit
//		System.out.println("-------------------");
		updateCustomer();
		Holder.getInstance().getGameStage().drawCanvasIngredients();
		Holder.getInstance().getGameStage().drawCustomer();
//		chkIngredient();
	}
	
	public void gameOver() {
		// do something when game over
		for(int i = 0; i < 8; i++) {
			Holder.getInstance().getIngredients().get(i).setPick(false);
		}
		ResImage.playS.stop();
		ResImage.timeupS.play();
		Holder.getInstance().createScoreBoard();
		SceneManager.gotoScoreBoard();
		Holder.getInstance().getCustomers().clear();
		Holder.getInstance().getGameStage().getChildren().clear();
		Holder.getInstance().createGameState();
	}
	
	public boolean chkRecipe(String order) {
		String str[] = {"BlueberryYogurt", "ChocolateBanana", "StrawberryShortCake", "ChocolateSmoothie", "VanillaSmoothie", "StrawberryBanana"};
		for(int i = 0; i < 6; i++) {
			if(str[i].equals(order)) {
				for(int j = 0; j < 8; j++) {
					if(!(Holder.getInstance().getIngredients().get(j).isPick()) && ingedients[i][j] == 1) {
						return false;
					}
					else if(Holder.getInstance().getIngredients().get(j).isPick() && ingedients[i][j] == 0) {
						return false;
					}
				}
			}
		}
		System.out.println("Finish!!!!");
		return true;
	}
	
	public boolean serve() {
		//do something when click at customer
		Customer customer = Holder.getInstance().getCustomers().get(0);
		System.out.println(customer.order());
		for(int i = 0; i < 8; i++) {
			System.out.println(Holder.getInstance().getIngredients().get(i).getName() + " " + Holder.getInstance().getIngredients().get(i).isPick());
		}
		if(chkRecipe(customer.order())) {
			//serve the right person --> do something
			customer.setIsWaiting(false);
			Holder.getInstance().increaseScore();
			System.out.println("serve");
			for(int i = 0; i < 8; i++) {
				Holder.getInstance().getIngredients().get(i).setPick(false);
			}
			return true ;
		}
		else {
			//serve the wrong person --> do something
		}
		for(int i = 0; i < 8; i++) {
			Holder.getInstance().getIngredients().get(i).setPick(false);
		}
		return false;
	}
	
	public void runAnimationTimer() {
		new AnimationTimer() {
			private long startTime ;
			private boolean isFirstFrame = true;
			@Override
			public void handle(long now) {
				if (isFirstFrame) {
					startTime = now;
					isFirstFrame = false;
					Holder.getInstance().getGameStage().getChildren().add(timerCV);
				}
				double realTime = (now - startTime)/1.0e9;
				double countTime = (limitTime - realTime);
				
				if(realTime >= limitTime) {
					gameOver();
					this.stop();
				}
				GraphicsContext gc = timerCV.getGraphicsContext2D();
				String timeString = String.format("Time : %.0f s", countTime);
				gc.setFill(Color.WHITESMOKE);
				gc.fillRect(0, 0, timerCV.getWidth(), timerCV.getHeight());
				gc.setFill(Color.BLACK);
				gc.setFont(timeFont);
				gc.setTextBaseline(VPos.CENTER);
				gc.setTextAlign(TextAlignment.CENTER);
				gc.fillText(timeString ,timerCV.getWidth()/2, timerCV.getHeight()/2);
				timerCV.setTranslateX(0);
				timerCV.setTranslateY(0);
				
				gameUpdate();
			}
		}.start();
	}
}