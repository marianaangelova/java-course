package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String name;
	private String surname;
	private long number;
	private Double averageMark;
	private ArrayList<Double> mathematicsMarks = new ArrayList<>();
	private ArrayList<Double> englishMarks = new ArrayList<>();
	private ArrayList<Double> economicsMarks = new ArrayList<>();
	private ArrayList<Double> lowFundMarks = new ArrayList<>();
	private ArrayList<Double> informaticsMarks = new ArrayList<>();
	private ArrayList<Double> marks = new ArrayList<>();
	
	public Student() {
		super();
	}
	
//	public Student(String name, String surname, long number, double averageMark) {
//		super();
//		this.name = name;
//		this.surname = surname;
//		this.number = number;
//		this.averageMark = averageMark;
//	}

	public Student(String name, String surname, long number, ArrayList<Double> mathematicsMarks,
			ArrayList<Double> englishMarks, ArrayList<Double> economicsMarks, ArrayList<Double> lowFundMarks,
			ArrayList<Double> informaticsMarks, ArrayList<Double> marks, Double averageMark) {
		super();
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.mathematicsMarks = mathematicsMarks;
		this.englishMarks = englishMarks;
		this.economicsMarks = economicsMarks;
		this.lowFundMarks = lowFundMarks;
		this.informaticsMarks = informaticsMarks;
		this.marks = marks;
		this.averageMark = averageMark;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		for (char c : name.toCharArray())
	    {
	        if (Character.isDigit(c)) return;
	    }
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		for (char c : surname.toCharArray())
	    {
	        if (Character.isDigit(c)) return;
	    }
		this.surname = surname;
	}
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public ArrayList<Double> getMathematicsMarks() {
		return mathematicsMarks;
	}

	public void setMathematicsMarks(ArrayList<Double> mathematicsMarks) {
		ArrayList<Double> mathematicsMarks2 = new ArrayList<>();
		for (int i = 0; i < mathematicsMarks.size(); i++) {
			mathematicsMarks2.add(mathematicsMarks.get(i));
		}
		this.mathematicsMarks = mathematicsMarks2;
	}

	public ArrayList<Double> getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(ArrayList<Double> englishMarks) {
		this.englishMarks = englishMarks;
	}

	public ArrayList<Double> getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(ArrayList<Double> economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public ArrayList<Double> getLowFundMarks() {
		return lowFundMarks;
	}

	public void setLowFundMarks(ArrayList<Double> lowFundMarks) {
		this.lowFundMarks = lowFundMarks;
	}

	public ArrayList<Double> getInformaticsMarks() {
		return informaticsMarks;
	}

	public void setInformaticsMarks(ArrayList<Double> informaticsMarks) {
		this.informaticsMarks = informaticsMarks;
	}

	public ArrayList<Double> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Double> marks) {
		this.marks = marks;
	}

	public String getAverageMark() {
		if (averageMark == 0) {
			return "This student has no marks yet!";
		}else {
			return averageMark.toString();
		}
	}
	public void setAverageMark(Double averageMark) {
		if (Double.isNaN(averageMark)){
			averageMark = 0d;
		}
		this.averageMark = averageMark;
	}
	
	
}
