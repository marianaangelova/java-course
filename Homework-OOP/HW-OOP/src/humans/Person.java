package humans;

public abstract class Person {
	protected String name;
	protected String surname;
	protected int years;
	protected int workingExperience;
	public static int counter;
	
	

	Person(){
		this.name = "";
		this.surname = "";
		this.years = 0;
		this.workingExperience = 0;
	}

	public Person(String name, String surname, int years, int workingExperience) {
		super();
		this.name = name;
		this.surname = surname;
		this.years = years;
		this.workingExperience = workingExperience;
		counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(int workingExperience) {
		if(workingExperience >= 0){
			this.workingExperience = workingExperience;
		}
	}
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}