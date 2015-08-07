package classTask;

import java.util.Scanner;

public class ValidatingInput {

	public static void main(String[] args) throws Exception {
		try {
        	User nasko = new User("nas@kbv","1563242432");
			System.out.println("Correct");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			User petko = new User("petko@","k1");
			System.out.println("Correct");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			User blago = new User("bl@","dkkddk1");
			System.out.println("Correct");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
