import java.util.Scanner;
public class SixthTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Enter the radius of the circle");
		double radius = input.nextDouble();
		input.close();
		double circlePerimeter = 2 * Math.PI * radius;
		double circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("Perimeter = "+circlePerimeter);
		System.out.println("Area = " + circleArea);
	}

}
