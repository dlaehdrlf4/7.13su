package threadpack;

public class ThreadMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runnable 인터페이스를 implements 한 클래스의 인스턴스
		ThreadEx4 th4 = new ThreadEx4("스레드 1");
		ThreadEx4 th5 = new ThreadEx4("스레드 2");
		
		//스레드 생성
		Thread th = new Thread(th4); // 다시 스레드를 만들어준다 start가 없기 때문에
		Thread th1 = new Thread(th5);
		
		//스레드의 우선 순위 변경
		th.setPriority(Thread.MIN_PRIORITY); // 가장 낮은 우선 순위로 설정
		th1.setPriority(Thread.MAX_PRIORITY); // 가장 높은 우선 순위로 설정
		
		//스레드 시작
		th.start();
		th1.start();

		try {
			Thread.sleep(3000);
			th.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
