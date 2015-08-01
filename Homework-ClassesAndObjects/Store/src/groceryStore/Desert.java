package groceryStore;

public class Desert extends Stock{
	String taste;
	boolean isIced;
	
	public Desert(){
		super();
		this.taste = "";
		this.isIced = false; 
	}
	
	
	
	public Desert(int price,boolean isAvailable,String taste, boolean isIced) {
		super();
		setTaste(taste);
		setIced(isIced);
	}



	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public boolean isIced() {
		return isIced;
	}
	public void setIced(boolean isIced) {
		this.isIced = isIced;
	}
	
}
