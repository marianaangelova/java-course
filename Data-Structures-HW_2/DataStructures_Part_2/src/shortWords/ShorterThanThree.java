package shortWords;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShorterThanThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String text = input.nextLine();
		Queue<String>queue = new LinkedList<String>();
		String[] textArray = text.split(" ");
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].length() >= 3) {
				queue.offer(textArray[i]);
			}
		}
		System.out.println("Solution with queue:");
		while (!queue.isEmpty()) {
			String current = queue.poll();
			System.out.print(current+" ");
		}
		System.out.println();
		//Solution with regex:
		System.out.println("Solution with regex:");
	    text = text.replaceAll("\\b[\\w']{1,2}\\b", "");

	    System.out.println(text);
	}

}
