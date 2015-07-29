import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		greeting(name);
	}
	public static void greeting(String name) {
		String nameModified = name.substring(0,1).toUpperCase() + name.substring(1);
		System.out.printf("Greeting, %s!",nameModified);
		
	}

}
