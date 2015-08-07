package homeworkTask;

import java.math.BigDecimal;

public class CorporativeAccount extends Account{
	String companyName;
	long bulstat;
	
	public CorporativeAccount(){
		super();
		this.companyName = "";
		this.bulstat = 0;
	}
	
	public CorporativeAccount(BigDecimal amount,String companyName, long bulstat) throws NegativeMoneyException {
		super(amount);
		setCompanyName(companyName);
		setBulstat(bulstat);
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getBulstat() {
		return bulstat;
	}
	public void setBulstat(long bulstat) {
		this.bulstat = bulstat;
	}
	public void printBulstat(){
		System.out.println("Bulstat:"+this.bulstat);
	}
}
