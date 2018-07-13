package newte;

public class MutexMain1 {

	public static void main(String[] args) {
		
		Mutex mutex = new Mutex();
		Thread th = new Thread(mutex);
		th.start();
		Thread th1 = new Thread(mutex);
		th1.start();
		
		
		
		//25초 후에 mutex의 result의 값을 확인
		try {
			Thread.sleep(50000);
			System.out.println(mutex.getResult());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
