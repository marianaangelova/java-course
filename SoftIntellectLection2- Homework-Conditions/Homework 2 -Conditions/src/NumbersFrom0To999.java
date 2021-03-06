import java.util.Scanner;
public class NumbersFrom0To999 {

	private static void PrintHundreds(int digit)
    {
        switch (digit)
        {
            case 1:
            	System.out.print("One hundred ");
            break;
            case 2:
            	System.out.print("two hundred ");
            	break;
            case 3: System.out.print("three hundred "); break;
            case 4: System.out.print("four hundred "); break;
            case 5: System.out.print("five hundred "); break;
            case 6: System.out.print("six hundred "); break;
            case 7: System.out.print("seven hundreds "); break;
            case 8: System.out.print("eight hundred "); break;
            case 9: System.out.print("nine hundred "); break;
            default: System.out.print(" ");
            break;
        }
    }
	private static void Print1To19(int number)
    {
        switch (number)
        {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            case 10: System.out.println("ten"); break;
            case 11: System.out.println("eleven"); break;
            case 12: System.out.println("twelve"); break;
            case 13: System.out.println("thirteen"); break;
            case 14: System.out.println("fourteen"); break;
            case 15: System.out.println("fifteen"); break;
            case 16: System.out.println("sexteen"); break;
            case 17: System.out.println("seventeen"); break;
            case 18: System.out.println("eighteen"); break;
            default: System.out.println("nineteen");
                break;
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		short n = input.nextShort();

        if (n >= 0 && n < 20)
        {
            Print1To19(n);
        }
        else if (n >= 20 && n < 100)
        {
            switch (n / 10)
            {
                case 2: System.out.print("twenty "); break;
                case 3: System.out.print("thirty "); break;
                case 4: System.out.print("forty "); break;
                case 5: System.out.print("fifty "); break;
                case 6: System.out.print("sixty "); break;
                case 7: System.out.print("seventy "); break;
                case 8: System.out.print("eighty "); break;
                case 9: System.out.print("ninety "); break;
                default: System.out.print(" "); break;

            }
            switch (n % 10)
            {
                case 0: System.out.println(" "); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                default: System.out.println("nine"); break;

            }
        }
        else if (n > 99 && n < 1000)
        {
            if ((n % 100) > 0 && (n % 100) < 20)
            {
                PrintHundreds(n / 100);

                System.out.print("and ");
                Print1To19(n % 100);
            }
            else
            {
                PrintHundreds(n / 100);
                switch ((n / 10) % 10)
                {
                    case 2: System.out.print("twenty "); break;
                    case 3: System.out.print("thirty "); break;
                    case 4: System.out.print("fourty "); break;
                    case 5: System.out.print("fifty "); break;
                    case 6: System.out.print("sixty "); break;
                    case 7: System.out.print("seventy "); break;
                    case 8: System.out.print("eighty "); break;
                    case 9: System.out.print("ninety "); break;
                    default: System.out.print(" "); break;

                }
                switch (n % 10)
                {
                    case 0: System.out.println(" "); break;
                    case 1: System.out.println("one"); break;
                    case 2: System.out.println("two"); break;
                    case 3: System.out.println("three"); break;
                    case 4: System.out.println("four"); break;
                    case 5: System.out.println("five"); break;
                    case 6: System.out.println("six"); break;
                    case 7: System.out.println("seven"); break;
                    case 8: System.out.println("eight"); break;
                    case 9: System.out.println("nine"); break;
                    default: System.out.println(" "); break;

                }
            }
        }
        else {
        	System.out.println("Invalid number!Enter number between 0-999!");
        }
	}
}
