package firstTask_SecondWay;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassBasic {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(7);
		for(int i=1;i<6;i++){
			Thread_1 someThread=new Thread_1();
			executor.execute(someThread);
			someThread.setName("Thread: "+i);
			System.out.printf("Hi,I am %s!Nice to meet you!%n",someThread.getName());
			
		}
		executor.shutdown();
		while(!executor.isTerminated()){
		}
		System.out.println("Finished all threads!");
	}

}
