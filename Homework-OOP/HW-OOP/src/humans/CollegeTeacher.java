package humans;

public class CollegeTeacher extends Teacher{
	String collegeName;
	
	public CollegeTeacher(){
		super();
		this.collegeName = "";
	}
	
	public CollegeTeacher(String name, String surname,int years,int workingExperience,
			String subject,String collegeName){
		super(name,surname,years,workingExperience,subject);
		setCollegeName(collegeName);
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
