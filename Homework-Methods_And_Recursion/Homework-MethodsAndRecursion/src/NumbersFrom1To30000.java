import java.util.Scanner;

public class NumbersFrom1To30000 {

	public static void main(String[] args) {
		System.out.print("Enter a number between 10 and 30 000: ");
		int number=input();

		int sumN=sumOfNumbers(number);
		
		System.out.println("The sum of " + number +  " numbers is: " + sumN);

	}
	
	public static int sumOfNumbers(int num){
		
		if(num>1){
			return num + sumOfNumbers(num-1);
		}else{
			return 1;
		}
	}
	
	public static int input() {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int number=0;
		
		
		while(input.hasNextInt()){
			
			number = input.nextInt();
			
			if(number>=10 && number<=30000){
				break;
			}
			
			System.out.print("Invalid number!");
		}
		return number;
	}

}