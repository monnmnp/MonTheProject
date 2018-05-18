package logic;

import java.util.ArrayList;
import java.util.List;

import character.Customer;

public class Holder {
	public static Holder instance = new Holder();
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	
	private Holder() {
		
	}
	
	public static Holder getInstance() {
		return instance;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	
}
