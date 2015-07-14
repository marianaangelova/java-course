import java.util.Scanner;
public class NinthTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: \n"+"a= ");
		int firstNum = input.nextInt();
		System.out.print("b= ");
		int secondNum = input.nextInt();
		input.close();
		int remainder = firstNum % secondNum;
		System.out.println("The remainder of dividing is: "+remainder);
	}

}
