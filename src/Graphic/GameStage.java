package Graphic;

import java.util.ArrayList;
import java.util.List;

import Menu.Blueberry;
import Menu.Ingredient;
import character.Customer;
import javafx.animation.AnimationTimer;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import logic.Holder;
import logic.Manager;

public class GameStage extends Pane {
	public Canvas gameStage = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private static final double BTN_WIDTH = 70,BTN_HEIGHT = 70;
	private List<Canvas> ingredients = new ArrayList<Canvas>();
	private List<Canvas> beverages = new ArrayList<Canvas>();
	private List<Image> images = new ArrayList<Image>();
	private List<Canvas> customers = new ArrayList<Canvas>();
	private Canvas recipeCV  = new Canvas(500,300);
	
	public GameStage() {
		GraphicsContext g = gameStage.getGraphicsContext2D();
		g.drawImage(ResImage.mixBar, 0, 0, SceneManager.SCENE_WIDTH, SceneManager.SCENE_HEIGHT);
		
		ingredients.add(getdrawBtn(ResImage.blueberry));
		setTranslate(ingredients.get(0), 20, 330);
		ingredients.get(0).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(0), ResImage.blueberry, "blueberry");
		images.add(ResImage.blueberry);
		
		ingredients.add(getdrawBtn(ResImage.strawberry));
		setTranslate(ingredients.get(1), BTN_WIDTH+20, 330);
		ingredients.get(1).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(1), ResImage.strawberry, "strawberry");
		images.add(ResImage.strawberry);
		
		ingredients.add(getdrawBtn(ResImage.chocolate));
		setTranslate(ingredients.get(2), BTN_WIDTH*2+20, 330);
		ingredients.get(2).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(2) , ResImage.chocolate, "chocolate");
		images.add(ResImage.chocolate);
		
		ingredients.add(getdrawBtn(ResImage.vanilla));
		setTranslate(ingredients.get(3), BTN_WIDTH*3+20, 330);
		ingredients.get(3).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(3), ResImage.vanilla, "vanilla");
		images.add(ResImage.vanilla);
		
		ingredients.add(getdrawBtn(ResImage.banana));
		setTranslate(ingredients.get(4), BTN_WIDTH*4+20, 330);
		ingredients.get(4).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(4), ResImage.banana, "banana");
		images.add(ResImage.banana);
		
		ingredients.add(getdrawBtn(ResImage.milk));
		setTranslate(ingredients.get(5), BTN_WIDTH*5+20, 330);
		ingredients.get(5).setFocusTraversable(true);
		addOnCanvasEvent(ingredients.get(5), ResImage.milk, "milk");
		images.add(ResImage.milk);
		
		ingredients.add(getdrawBtn(ResImage.yogurt));
		setTranslate(ingredients.get(6), BTN_WIDTH*6+20, 330);
		addOnCanvasEvent(ingredients.get(6), ResImage.yogurt, "yogurt");
		images.add(ResImage.yogurt);
		
		ingredients.add(getdrawBtn(ResImage.honey));
		setTranslate(ingredients.get(7), BTN_WIDTH*7+20, 330);
		addOnCanvasEvent(ingredients.get(7), ResImage.honey, "honey");
		images.add(ResImage.honey);
		
		Canvas recipeBtn = getdrawBtn(ResImage.recipeBtn);
		setTranslate(recipeBtn, BTN_WIDTH*8+30, 330);
		addRecipeEvent(recipeBtn,ResImage.recipeBtn);
		
		Canvas binBtn = getdrawBtn(ResImage.bin);
		setTranslate(binBtn, 20, 440);
		trashEvent(binBtn,ResImage.bin);
		
		Canvas blenderBtn = getdrawBtn(ResImage.blender);
		setTranslate(blenderBtn, BTN_WIDTH+20, 440);
		blenderEvent(blenderBtn, ResImage.blender);
		
		g.drawImage(ResImage.blender2, 200, 370, 300, 188);
		
		getChildren().add(gameStage);
		getChildren().add(recipeBtn);
		getChildren().addAll(ingredients.get(0),ingredients.get(1),ingredients.get(2),ingredients.get(3));
		getChildren().addAll(ingredients.get(4),ingredients.get(5),ingredients.get(6),ingredients.get(7),blenderBtn,binBtn);
		for(int i = 0; i < 6; i++) {
			Canvas person = new Canvas(Customer.IMG_WIDTH,Customer.IMG_HEIGHT);
			setTranslate(person, (i*115), 175);
			customers.add(person);
			getChildren().add(customers.get(i));
		}
		
		for(int i = 0; i < 5; i++) {
			Canvas bev = new Canvas(75, 75);
			setTranslate(bev, 60+(i*115), 120);
			beverages.add(bev);
			getChildren().add(beverages.get(i));
		}
	}
	
	public void drawCustomer() {
//		System.out.println("drawCustomer");
		for(int i = 0; i < Holder.getInstance().getCustomers().size(); i++) {
//			System.out.println(i);
			Canvas img = customers.get(i);
			GraphicsContext gc = img.getGraphicsContext2D();
			gc.clearRect(0, 0, Customer.IMG_WIDTH, Customer.IMG_HEIGHT);
			gc.drawImage(Holder.getInstance().getCustomers().get(i).getCusImage(), 0, 0, Customer.IMG_WIDTH, Customer.IMG_HEIGHT);
		}
		
		for(int i = 0; i < Holder.getInstance().getCustomers().size() && i < 5; i++) {
//			System.out.println(i);
			Canvas img = beverages.get(i);
			GraphicsContext gc = img.getGraphicsContext2D();
			gc.clearRect(0, 0, 75, 75);
			gc.drawImage(Holder.getInstance().getCustomers().get(i).getOrderImg(), 0, 0, 75, 75);
		}
		
	}
	
	public Canvas getdrawBtn(Image img) {
		Canvas canvas = new Canvas(BTN_WIDTH, BTN_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(252, 220, 116));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
		return canvas;
	}
	
	public void drawBtn(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(252, 220, 116));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	public void drawBoard(Canvas canvas,Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.rgb(250, 245, 178));
		gc.fillRoundRect(0, 0, BTN_WIDTH, BTN_HEIGHT, 16, 16);
		gc.drawImage(img, 0, 0, BTN_WIDTH, BTN_HEIGHT);
	}
	
	private void setTranslate(Canvas canvas , double x , double y) {
		canvas.setTranslateX(x);
		canvas.setTranslateY(y);
	}
	
	public void drawCanvasIngredients() {
		for(int i = 0; i < 8; i++) {
			Canvas canvas = ingredients.get(i);
			Image img = images.get(i);
			if(Holder.getInstance().getIngredients().get(i).isPick()) {
				drawBoard(canvas, img);
			}
			else {
				drawBtn(canvas, img);
			}
		}
	}
	
	private void blenderEvent(Canvas canvas,Image img){
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				System.out.println("Serve111");
				if(Manager.getInstance().serve()) {
					System.out.println("Serve");
					drawBlender(Holder.getInstance().getCustomers().get(0).getBlenderImg());
				}
				
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBoard(canvas, img);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas, img);
			}
			
		});
	}
	
	private void addOnCanvasEvent(Canvas canvas,Image img, String name) {
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				for(Ingredient x : Holder.getInstance().getIngredients()) {
					if(x.getName() == name) {
						if(x.isPick()==true) {
							x.setPick(false);
						}
						else{
							x.setPick(true);
						}
					}
					
				}
			}
		});
		
	}
	private void trashEvent(Canvas canvas,Image img){
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				for(int i = 0; i < 8; i++) {
					Holder.getInstance().getIngredients().get(i).setPick(false);
				}
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBoard(canvas, img);
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawBtn(canvas, img);
			}
			
		});
	}
	
	private void addRecipeEvent(Canvas canvas,Image img){
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		canvas.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				drawRecipe();
			}
		});
		canvas.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				GraphicsContext gc = recipeCV.getGraphicsContext2D();
				gc.clearRect(0, 0, 500, 300);
			}
			
		});
	}
	
	public void drawBlender(Image img) {
		ImageView iv = new ImageView();
		iv.setImage(img);
		iv.setFitHeight(188);
		iv.setFitWidth(300);
		iv.setTranslateX(200);
		iv.setTranslateY(370);
		getChildren().add(iv);
	}
	
	public void drawRecipe() {
		GraphicsContext gc = recipeCV.getGraphicsContext2D();
		gc.drawImage(ResImage.recipe, 150, 125, recipeCV.getWidth(), recipeCV.getHeight());
		recipeCV.setFocusTraversable(true);
		getChildren().add(recipeCV);
	}
}