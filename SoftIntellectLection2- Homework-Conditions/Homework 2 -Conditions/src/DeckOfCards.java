import java.util.Scanner;
public class DeckOfCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a card symbol:");
        String cards = input.nextLine();
        switch(cards) {
            case"2":
            case"3":
            case"4":
            case"5":
            case"6":
            case"7":
            case"8":
            case"9":
            case"10":
            case"J":
            case"Q":
            case"K":
            case"A":
            	System.out.println("Valid card");
                break;
                default:
                	System.out.println("Invalid card");
                break;
        }
	}
}
