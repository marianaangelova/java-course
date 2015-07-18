import java.util.Scanner;
public class Bonus_Points {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter points: ");
		int points = input.nextInt();
        if (points >= 1 && points <= 9)
        {
            if (points >= 1 && points <= 3)
            {
            	System.out.println(points * 5);
            }

            else if (points >= 4 && points <= 6)
            {
            	System.out.println(points * 10);
            }
            else if (points >= 7 && points <= 9)
            {
            	System.out.println(points * 50);
            }
        }
        else
        {
        	System.out.println("Invalid value");
        }
	}

}
