package homeworkTask;

import java.math.BigDecimal;

public class PersonalAccount extends Account{
	private String name;
	long personalN;
	
	public PersonalAccount(){
		super();
		this.name = "";
		this.personalN = 0;
	}
	
	public PersonalAccount(BigDecimal amount,String name, long personalN) throws NegativeMoneyException {
		super(amount);
		setName(name);
		setpersonalN(personalN);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getpersonalN() {
		return personalN;
	}
	public void setpersonalN(long personalN) {
		this.personalN = personalN;
	}
	public void printPersonalN(){
		System.out.println("Personal number:"+this.personalN);
	}

}
