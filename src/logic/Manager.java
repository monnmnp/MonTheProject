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
}
