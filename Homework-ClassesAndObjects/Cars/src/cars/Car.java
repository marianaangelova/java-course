package cars;

public class Car {
	protected int price;
	
	public Car() {
		this.price = 0;
	}
	
	public Car(int price) {
		this();
		setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void sayPrice() {
		System.out.println("My price is:"+this.price);
	}
}
