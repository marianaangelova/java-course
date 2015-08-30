package sortSentence;

import java.util.Arrays;
import java.util.Scanner;

public class sortSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		sentence.replaceAll("[\\W\\s]+", " ");
		String[] words = sentence.split("[\\s]");
		sortString(words);
		System.out.println(Arrays.toString(words));
	}
	public static void sortString(String[] sentence){
		for (int i = 0; i < sentence.length; i++) {
			for (int j = i + 1; j < sentence.length; j++) {
				if (sentence[i].compareToIgnoreCase(sentence[j])>0) {
					String temp = sentence[i];
					sentence[i] = sentence[j];
					sentence[j] = temp;
				}
			}
		}
	}

}