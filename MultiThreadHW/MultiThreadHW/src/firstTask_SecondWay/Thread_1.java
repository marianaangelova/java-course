package firstTask_SecondWay;

import java.util.Random;

public class Thread_1 extends Thread{
	Random rnd = new Random();
	public void run(){
		System.out.println("The thread is started!");
		try {
			Thread.sleep(1000*(rnd.nextInt(10)));
		}  catch(Exception e){
			e.getMessage();
		}
		System.out.println("The thread complete!");
	}
}
