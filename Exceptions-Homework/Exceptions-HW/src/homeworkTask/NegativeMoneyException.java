package homeworkTask;

public class NegativeMoneyException extends Exception {
	public NegativeMoneyException(){
		super();
	}
	
	public NegativeMoneyException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
