package ClassTask;

public class Policeman extends Employee {
	private String rank;
	
	public Policeman(){
		super();
		this.rank = "";
	}
	
	public Policeman(int workingHours, int salary,
			String policemanRank){
		super(workingHours,salary);
		
		setPolicemanRank(policemanRank);
	}
	
	public String getPolicemanRank() {
		return rank;
	}
	public void setPolicemanRank(String policemanRank) {
		this.rank = policemanRank;
	}
	public void sayRank(){
		System.out.println("My rank is:"+this.rank);
	}
}
