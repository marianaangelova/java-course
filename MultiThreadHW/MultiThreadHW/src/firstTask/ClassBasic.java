package firstTask;

public class ClassBasic {

	public static void main(String[] args) {
		Thread t1 = new Thread_1();
		Thread t2 = new Thread_2();
		Thread t3 = new Thread_3();
		Thread t4 = new Thread_4();
		Thread t5 = new Thread_5();
		t1.setName("Claudia");
		t2.setName("Lidia");
		t3.setName("Glori");
		t4.setName("Viki");
		t5.setName("Alex");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
