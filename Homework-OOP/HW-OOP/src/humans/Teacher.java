package humans;

public class Teacher extends Person implements CheckingHW{
	String subject;
	
	public Teacher(){
		setName("");
		setSurname("");
		setWorkingExperience(0);
		setYears(0);
		this.subject = "";
	}
	
	public Teacher(String name, String surname,int years,int workingExperience,String subject){
		super(name,surname,years,workingExperience);
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void sayGoodDay(){
		System.out.println("Good day!");
	}
	public void sayGoodbye(){
		System.out.println("Goodbye!");
	}
	public void saySubject(){
		System.out.println("My subject is "+this.subject);
	}
	public void checkingHomeworks(){
		System.out.println("I can check homeworks.");
	}
}