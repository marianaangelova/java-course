package countries;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class CountriesAndCapitals {

	public static void main(String[] args) {
		try {
			String fileName = "..\\ClassTasks\\countries.txt";
			String filePath = "..\\ClassTasks\\capitals.txt";
			String[] countries = new String[5];
			countries = readFile(fileName);
			String[] capitals = askUser(countries);
			writeFile(filePath, capitals);
			System.out.println("Successful!");
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist! Unable to read it.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile(String filePath,String[] capitals) throws FileNotFoundException{
		PrintStream fileWriter = new PrintStream(filePath);
		for (int i = 0; i < capitals.length; i++) {
			fileWriter.println(capitals[i]);
		}
	}
	public static String[] askUser(String[] questionary){
		Scanner input = new Scanner(System.in);
		String[] capitals = new String[questionary.length];
		for (int i = 0; i < questionary.length; i++) {
			System.out.printf("What is the capital of %s?\n",questionary[i]);
			capitals[i] = input.nextLine();
		}
		return capitals;
	}
	public static String[] readFile(String fileName) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream(fileName);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		String[] countries = new String[5];
		for (int i = 0; i < countries.length; i++) {
			countries[i] = in.readLine();
		}
		
		in.close();
		fis.close();
		return countries;
	}
}
