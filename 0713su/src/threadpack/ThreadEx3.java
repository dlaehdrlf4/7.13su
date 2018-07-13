package threadpack;

//Runnable 인터페이스를 구현한 클래스
public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		String msg = "봉구비어";
		int idx = 0;
		while(true) {
			String str = "";
			for(int i =0 ; i <msg.length();i=i+1) {
				char ch = msg.charAt((idx+i)%msg.length());// %를 써서 넘어가는것을 방지
				str = str + ch;
			}
			System.out.println(str);
			try {
				//1초마다 무한 반복
				Thread.sleep(1000);
				idx = idx + 1; // idx가 하나씩 증가
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
