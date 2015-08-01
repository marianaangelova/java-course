package groceryStore;

public class Meat extends Stock {
	double proteinContent;
	double fatContent;
	
	public Meat(){
		super();
		
		this.proteinContent = 0;
		this.fatContent = 0;
	}
	
	
	
	public Meat(int price,boolean isAvailable, double proteinsContent, double fatContent) {
		super(price,isAvailable);
		setProteinsContent(proteinsContent);
		setFatContent(fatContent);
	}



	public double getProteinsContent() {
		return proteinContent;
	}
	public void setProteinsContent(double proteinsContent) {
		this.proteinContent = proteinsContent;
	}
	
	public double getFatContent() {
		return fatContent;
	}
	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}
	
	
}
