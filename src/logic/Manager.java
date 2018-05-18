package logic;

import character.Customer;
import javafx.animation.AnimationTimer;

public class Manager {
	
	public void updateCustomer() {
		Holder.getInstance().getCustomers().removeIf(e -> {
			return false;
		});
		while(Holder.getInstance().getCustomers().size() < 6) {
			Holder.getInstance().getCustomers().add(new Customer());
			
		}
		
	}
	public void startGame() {
		// 
		// 
		// Fighting na krub !! :D 
		//  Miss you jang loeyyyyy <3
		//
		//			from someone you already known.
		//
	}
	
	public void gameUpdate() { //update game in every time unit
		updateCustomer();
	}
	
	public boolean isLose() { 
		return false;
		
	}
	
	public void gameOver() {
		// do something when game over
	}
	
	public boolean serve(Customer customer) {
		return false;
		//do something when click at customer
		//serve the wrong person --> do something
		//serve the right person --> do something
	}
	
	
}
