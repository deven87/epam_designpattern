package epam_designpatterns.singleton;

public class Task_01_Hometask_Singleton_pattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// both below are same object
		CandyMaker candyMaker = CandyMaker.getCandyMaker();
		CandyMaker candyMaker1 = CandyMaker.getCandyMaker();

		Runnable run = () -> {
			try {
				CandyMaker.getCandyMaker();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Thread thread1 = new Thread(run);
		Thread thread2 = new Thread(run);
		Thread thread3 = new Thread(run);

		// same object
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
