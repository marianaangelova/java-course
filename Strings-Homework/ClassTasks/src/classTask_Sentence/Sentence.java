package classTask_Sentence;

import java.util.Scanner;

public class Sentence {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String greeting = "Greeting";
		
		if (sentence.startsWith(greeting) && sentence.contains("water") && sentence.endsWith(".")) {
			System.out.println("You entered correct sentence!");
		}else{
			System.out.println("Invalid sentence!");
		}
	}
}
