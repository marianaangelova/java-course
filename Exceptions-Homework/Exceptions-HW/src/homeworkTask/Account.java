package homeworkTask;

import java.math.BigDecimal;

public class Account {
	protected BigDecimal amount;
	
	public Account(){
		this.amount = new BigDecimal(0);
	}
	
	public Account(BigDecimal amount) throws NegativeMoneyException{
		super();
		setAmount(amount);
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) throws NegativeMoneyException {
		if (amount.compareTo(new BigDecimal(0)) < 0) {
			throw new NegativeMoneyException("Negative money!");
		}
		this.amount = amount;
	}
}
