package secondTask;

public class Threads {
	synchronized void printNumbers(){
		for (int i = 0; i < 25000; i++) {
			if (i == 200) {
				try {
					wait();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.print(i+" ");
		}
	}
	synchronized void printMessage(){
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Running...");
		}
		notify();
	}
}
