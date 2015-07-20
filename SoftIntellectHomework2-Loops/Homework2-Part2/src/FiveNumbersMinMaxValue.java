import java.util.Scanner;
public class FiveNumbersMinMaxValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int number;
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for(int i = 1;i <= 5;i++) {
			number = input.nextInt();
			if (number > maxValue) {
                maxValue = number;
            }else if (number < minValue) {
                minValue = number;
            }
		}
		System.out.println("Min value is: "+minValue);
		System.out.println("Max value is: "+maxValue);
	}

}
