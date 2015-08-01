package groceryStore;

public class Fruit extends Stock{
	String origin;
	int calories;
	
	public Fruit(){
		super();
		this.origin = "";
		this.calories = 0;
	}
	
	public Fruit(int price, boolean isAvailable,String origin, int calories) {
		super(price,isAvailable);
		setOrigin(origin);
		setCalories(calories);
	}

	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
