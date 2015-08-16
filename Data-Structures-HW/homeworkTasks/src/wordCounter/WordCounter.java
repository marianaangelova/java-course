package wordCounter;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[20];
		System.out.println("Enter 20 words:");
		for (int i = 0; i < words.length; i++) {
			words[i] = input.nextLine();
		}
	HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		
	for (String word : words) {
		Integer count = wordsCount.get(word);
		if (count == null) {
			count = 0; 
		}
		wordsCount.put(word, count + 1);
	}
	
	for (String result: wordsCount.keySet()){

        String key =result.toString();
        String value = wordsCount.get(result).toString();  
        System.out.println(key + "-" + value);  


} 
	}

}

	