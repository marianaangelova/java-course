
public class SymetricNumbers {

	public static void main(String[] args) {
		
		int a = 11, b = 999;
		PrintSymetricNumbers(a, b);
	}
	public static void PrintSymetricNumbers(int a ,int b) {
		
		
		for (int i = a; i <= b; i++) {
			if (i >= a && i < 100) {
				if ((i % 10) == (i / 10)) {
					System.out.print(i+" ");
				}
			}
			else if (i >= 100) {
				if ((i % 10) == (i / 100)) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
