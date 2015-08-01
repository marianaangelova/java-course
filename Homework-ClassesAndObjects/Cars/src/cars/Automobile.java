package cars;

public class Automobile extends Car{
	private double fuelConsumption;

	public Automobile() {
		super();
		this.fuelConsumption = 0;
	}

	Automobile(int price,double fuelConsumption) {
		super(price);
		this.fuelConsumption = fuelConsumption;;
	}


	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
}
