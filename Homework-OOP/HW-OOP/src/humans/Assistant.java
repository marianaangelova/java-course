package humans;

public class Assistant extends Lecturer implements CheckingHWSecond{
	boolean isMain;
	
	public Assistant(){
		super();
		this.isMain = false;
	}

	public Assistant(String name, String surname,int years,int workingExperience,
			String subject,boolean isMain){
		super(name,surname,years,workingExperience,subject);
		setMain(isMain);
	}
	
	public boolean isMain() {
		return isMain;
	}
	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}
	public void presenting(){
		String mainOrNot = null;
		if (this.isMain) {
			mainOrNot = "main";
		}
		else{
			mainOrNot = "not main";
		}
		System.out.printf("My name is %s %s and I am %s assistant.%n",super.name,super.surname,mainOrNot);
	}
	public void writeScientificArticles(){
		System.out.println("I can write scientific articles.");
	}
	public void checkingExams(){
		System.out.println("I can check exams.\n");
	}
	public void checkingHomeworksSecondWay(){
		System.out.println("I can check homeworks too.");
	}
}
