package ClassTask;

public class Employee {
	protected int workingHours;
	protected int salary;
	
	public Employee() {
		this.workingHours = 0;
		this.salary = 0;
	}
	
	public Employee(int workingHours, int salary) {
		this();
		setWorkingHours(workingHours);
		setSalary(salary);
	}
	
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void present(){
		System.out.printf("Hi, I work %d hours and get %d dollars salary.%n"
				,this.workingHours,this.salary);
	}
}
