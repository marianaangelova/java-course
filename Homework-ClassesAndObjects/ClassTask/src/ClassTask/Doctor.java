package ClassTask;

	public class Doctor extends Employee {
	private int nightDuties;
	private int dayDuties;
	
	public Doctor(){
		super();
		this.nightDuties = 0;
		this.dayDuties = 0;
	}
	
	public Doctor(int workingHours,int salary, int nightDuties, int dayDuties) {
		super(workingHours,salary);
		setNightDuties(nightDuties);
		setDayDuties(dayDuties);
	}

	public int getNightDuties() {
		return nightDuties;
	}
	public void setNightDuties(int nightDuties) {
		this.nightDuties = nightDuties;
	}
	
	public int getDayDuties() {
		return dayDuties;
	}
	public void setDayDuties(int dayDuties) {
		this.dayDuties = dayDuties;
	}
	
	public void sayDuties() {
		System.out.printf("I have %d night duties this month and %d "
				+ "day duties%n",this.nightDuties,this.dayDuties);
	}
}