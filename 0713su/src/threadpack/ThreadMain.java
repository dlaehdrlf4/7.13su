package threadpack;

public class ThreadMain {

	public static void main(String[] args) {
		/*//앞에서 만든 클래스의 인스턴스를 만들고 run 메소드를 호출
		Thread thread = new Thread1();
		thread.run(); // run메소드 호출
		Thread thread2 = new Thread1();
		thread2.run();*/
		
		
		
/*		//스레드 실행
		Thread1 th1 = new Thread1();
		th1.start();
		Thread1 th2 = new Thread1();
		th2.start();
		*/
		ThreadEx1 th3 = new ThreadEx1();
		th3.start();
		ThreadEx1 th4 = new ThreadEx1();
		th4.start();
		
		System.out.println("정말 스레드?");
	}

}
