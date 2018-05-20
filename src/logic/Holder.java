package logic;

import java.util.ArrayList;
import java.util.List;

import Graphic.GameStage;
import Menu.Ingredient;
import character.Customer;

public class Holder {
	public static Holder instance = new Holder();
	
	private List<Customer> customers ;
	private GameStage gameStage = new GameStage();
	
	private Holder() {
		customers = new ArrayList<Customer>();
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
}
