import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter coefficients: ");
		System.out.print("a= ");
		float a = input.nextFloat();
		System.out.print("b= ");
		float b = input.nextFloat();
		System.out.print("c= ");
		float c = input.nextFloat();
		float discriminant = ((float)Math.pow(b, 2) - 4 * a * c);
        float x1;
        float x2;
        if (discriminant == 0)
        {
            x1 = x2 = (-b / (2 * a));
            System.out.println("x1= x2= "+x1);
        }
            else if(discriminant < 0)
        {
            	System.out.println("There are no real roots");
        }
        else {
            x1 = (float) ((-b + Math.sqrt(discriminant))/ (2 * a));
            x2 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.printf("x1 = %f\nx2 = %f",x1,x2);
        }
	}

}