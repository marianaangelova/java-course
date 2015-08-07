package groceryStore;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Stock {
	int price;
	boolean isAvailable;
	
	public Stock(){
		this.price = 0;
		isAvailable = false;
	}
	
	
	
	public Stock(int price, boolean isAvailable) {
		this.price = price;
		this.isAvailable = isAvailable;
	}



	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void sayPrice(){
		System.out.printf("The price of the stock is %d dollars%n",this.price);
	}
	
}