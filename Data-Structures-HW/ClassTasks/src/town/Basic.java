package town;

import java.util.HashSet;

public class Basic {

	public static void main(String[] args) {
		Town torevieja = new Town("Torrevieja", "Spain", 203209);
		Town sofia = new Town("Sofia", "Bulgaria", 2000000);
		Town plovdiv = new Town("Plovdiv", "Bulgaria", 300000);
		Town varna = new Town("Varna", "Bulgaria", 330000);
		Town burgas = new Town("Burgas", "Bulgaria", 290000);
		
		HashSet<Town> towns = new HashSet<Town>();
		towns.add(torevieja);
		towns.add(sofia);
		towns.add(plovdiv);
		towns.add(varna);
		towns.add(burgas);
		for (Town town : towns) {
			if (town.getName() == "Varna") {
				towns.remove(town);
				break;
			}
		}
		for (Town town : towns) {
			System.out.printf("%s, %s, %d%n",town.getName(),town.getCountry(),town.getPopulation());
		}
	}

}