package character;

import java.util.Random;

import Menu.Beverage;
import javafx.scene.image.Image;

public class Customer extends Entity {
	
	public enum state{
		waiting, left, walk;
	}
	private state currentState;
	private double mood;
	private Image cusImage;
	private Beverage bev;
	private boolean isWaiting = true;
	//new boolean for check if isWaiting
	
	
	public Customer() {
		this.bev = Generator.getInstance().getRandomBev();
		this.cusImage = Generator.getInstance().getRandomImage();
		mood = new Random().nextDouble()*100 ;
		currentState = state.walk;
		//maybe initial state 
	}
	
	public void leave() {
		//do something when not prefer to wait
	}
	
	public boolean isWaiting() {
		if(this.isWaiting) return true;
		return false;
		//mai bok pai thum angggg
	}
	
	public void move() {
		
	}
	
	public String order() {
		//you may need this method
		return this.bev.getName();
	}
	

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean getIsWaiting() {
		return this.isWaiting;
	}
	
	public void setIsWaiting(boolean isWaiting) {
		this.isWaiting = isWaiting;
	}
}