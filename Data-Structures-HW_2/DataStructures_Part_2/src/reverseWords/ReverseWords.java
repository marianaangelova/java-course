package reverseWords;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = input.nextLine();
		String[] array = text.split(" ");
		Stack<String>myStack = new Stack<String>();
		for (int i = 0; i < array.length; i++) {
			myStack.push(array[i]);
		}
		while (!myStack.isEmpty()) {
			String current = myStack.pop();
			System.out.print(current+" ");
			
		}
	}

}
