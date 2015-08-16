package uniqueWords;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = input.nextLine();
		String[] words = text.split("[, -.!?:;]+");
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}
		System.out.println("This are the unique words:");
		for (String result : wordsCount.keySet()) {

			if (wordsCount.get(result) == 1) {
				String key = result.toString();
				System.out.println(key);

			}
		}
	}

}
