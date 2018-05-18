package character;

public abstract class Entity {
	double x,y;
	boolean isDestroyed;
	
	public Entity() {
		isDestroyed = false;
	}
	
	abstract void draw();
}
