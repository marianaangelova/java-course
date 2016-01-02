package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String name;
	private String surname;
	private long number;
	private Double averageMark;
	private StringBuilder mathematicsMarks;
	private StringBuilder englishMarks;
	private StringBuilder economicsMarks;
	private StringBuilder lowFundMarks;
	private StringBuilder informaticsMarks;
	private ArrayList<Double> marks = new ArrayList<>();
	
	public Student() {
		super();
	}
	
	public Student(String name, String surname, long number, StringBuilder mathematicsMarks,
			StringBuilder englishMarks, StringBuilder economicsMarks, StringBuilder lowFundMarks,
			StringBuilder informaticsMarks) {
		super();
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.mathematicsMarks = mathematicsMarks;
		this.englishMarks = englishMarks;
		this.economicsMarks = economicsMarks;
		this.lowFundMarks = lowFundMarks;
		this.informaticsMarks = informaticsMarks;
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
	
	public StringBuilder getMathematicsMarks() {
		return mathematicsMarks;
	}

	public void setMathematicsMarks(StringBuilder mathematicsMarks) {
		if (mathematicsMarks.length() > 0) {
			mathematicsMarks.setLength(mathematicsMarks.length() - 1);
		}
		this.mathematicsMarks = mathematicsMarks;
	}
	
	public StringBuilder getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(StringBuilder englishMarks) {
		if (englishMarks.length() > 0) {
			englishMarks.setLength(englishMarks.length() - 1);
		}
		this.englishMarks = englishMarks;
	}

	public StringBuilder getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(StringBuilder economicsMarks) {
		if (economicsMarks.length() > 0) {
			economicsMarks.setLength(economicsMarks.length() - 1);
		}
		this.economicsMarks = economicsMarks;
	}

	public StringBuilder getLowFundMarks() {
		return lowFundMarks;
	}

	public void setLowFundMarks(StringBuilder lowFundMarks) {
		if (lowFundMarks.length() > 0) {
			lowFundMarks.setLength(lowFundMarks.length() - 1);
		}
		this.lowFundMarks = lowFundMarks;
	}

	public StringBuilder getInformaticsMarks() {
		return informaticsMarks;
	}

	public void setInformaticsMarks(StringBuilder informaticsMarks) {
		if (informaticsMarks.length() > 0) {
			informaticsMarks.setLength(informaticsMarks.length() - 1);
		}
		this.informaticsMarks = informaticsMarks;
	}
	
	
}
