package town;

public class Town {
	private String name;
	private String country;
	private int population;
	
	
	
	public Town(String name, String country, int population) {
		super();
		setName(name);
		setCountry(country);
		setPopulation(population);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

}
