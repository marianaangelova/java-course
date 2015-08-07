package homeworkTask;

public class InvalidAccountException extends Exception{
	
	public InvalidAccountException(){
		super();
	}
	
	public InvalidAccountException(String exceptionMessage){
		super(exceptionMessage);
	}
}
