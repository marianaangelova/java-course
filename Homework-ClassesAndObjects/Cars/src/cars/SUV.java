package cars;

public class SUV extends Car{
	private boolean isHighly;
	
	public SUV() {
		super();
		this.isHighly = false;
	}
	
	
	SUV(int price,boolean isHighly) {
		super(price);
		setHighly(isHighly);
	}


	public boolean isHighly() {
		return isHighly;
	}

	public void setHighly(boolean isHighly) {
		this.isHighly = isHighly;
	}
}
