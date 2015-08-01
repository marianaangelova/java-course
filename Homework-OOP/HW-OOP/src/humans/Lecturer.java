package humans;

public class Lecturer extends Person implements CheckingHW{
	String universityName;
	static final int WEEK_LECTURES = 10;
	
	public Lecturer(){
		setName("");
		setSurname("");
		setWorkingExperience(0);
		setYears(0);
		this.universityName = "";
	}

	public Lecturer(String name, String surname,int years,int workingExperience,String university) {
		super(name,surname,years,workingExperience);
		setUniversity(university);
	}

	public String getUniversity() {
		return universityName;
	}

	public void setUniversity(String university) {
		this.universityName = university;
	}
	
	public void sayGoodDay(){
		System.out.println("Good day!");
	}
	public void conductingExercises(double hoursExercise){
		System.out.printf("I am conducting %f hours excercises per week%n",hoursExercise);
	}
	public void conductingExercises(int hoursExercises){
		System.out.printf("I am conducting %d hours excercises per month%n",hoursExercises);
	}
	public void sayMaxLectures(){
		System.out.println("My max week lections are "+this.WEEK_LECTURES);
	}
	public void sayUniversity(){
		System.out.println("The name of my university is "+this.universityName);
	}
	public void conductingExercises(String kindOfExercise){
		System.out.printf("I am conducting %s excercises%n",kindOfExercise);
	}
	public void checkingHomeworks(){
		System.out.println("I can check homeworks.\n");
	}
}
