
public class SecondTask {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.println("a and b befor:"+ a +" "+ b);
		a *= b;
		b = a / b;
		a = a / b;
		System.out.println("a and b after:"+a + " "+ b);
		
	}

}