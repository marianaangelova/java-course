package replacingWord;

public class NotAWordException extends Exception{
	public NotAWordException(){
		super();
	}
	
	public NotAWordException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
