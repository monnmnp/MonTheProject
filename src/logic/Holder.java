package logic;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiEvent;

import Graphic.GameStage;
import Menu.Banana;
import Menu.Blueberry;
import Menu.Chocolate;
import Menu.Honey;
import Menu.Ingredient;
import Menu.Milk;
import Menu.Strawberry;
import Menu.Vanilla;
import Menu.Yogurt;
import character.Customer;

public class Holder {
	public static Holder instance = new Holder();
	
	private List<Customer> customers ;
	private List<Ingredient> ingredients;
	private GameStage gameStage = new GameStage();
	
	private Holder() {
		customers = new ArrayList<Customer>();
		ingredients = new ArrayList<Ingredient>();
		ingredients.add(new Blueberry());
		ingredients.add(new Strawberry());
		ingredients.add(new Vanilla());
		ingredients.add(new Honey());
		ingredients.add(new Chocolate());
		ingredients.add(new Banana());
		ingredients.add(new Milk());
		ingredients.add(new Yogurt());
	}
	
	public static Holder getInstance() {
		return instance;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public GameStage getGameStage() {
		return gameStage;
	}
	
	public List<Ingredient> getIngredients(){
		return this.ingredients;
	}
	
	public void createGameState() {
		gameStage = new GameStage();
	}
}