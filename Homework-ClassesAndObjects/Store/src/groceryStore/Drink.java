package groceryStore;

public class Drink extends Stock{
	boolean isAlcoholic;
	String manufacturer;
	
	public Drink(){
		super();
		this.isAlcoholic = false;
		this.manufacturer = "";
	}
	
	
	
	public Drink(int price, boolean isAvailable,boolean isAlcoholic, String manufacturer) {
		super(price, isAvailable);
		setAlcoholic(isAlcoholic);
		setManufacturer(manufacturer);
	}



	public boolean isAlcoholic() {
		return isAlcoholic;
	}
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	
	public String getManufacture() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
