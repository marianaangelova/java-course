import java.util.Random;

public class MultiplyingRandomNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(1000);
		int b = rand.nextInt(1000);
		int c = rand.nextInt(1000);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("random numbers:%d,%d,%d\n",a,b,c);
			System.out.println(multiply(a, b, c));
		}
	}
	public static long multiply(int a, int b, int c) {
		long result = a * b * c;
		return result;
	}

}
