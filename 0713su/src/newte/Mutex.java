package newte;

public class Mutex implements Runnable {

	private int result;
	private int idx;

	// 합계 구하는 메소드 만들기
	// synchronized 붙인 메소드는
	// 여러 개의 스레드가 동시에 호출하더라도 하나의 수행이 종료된 후에 메소드가 호출됩니다.
	private void sum() {
		for (int i = 0; i < 10000; i = i + 1) {
			// 자신이 가지고 있는 자원을 사용할 때는
			// 이 코드 영역은 동기적(순서대로 있는것을 의미)으로 동작하도록 해주는 설정
			synchronized (this) { // this가 내안에 있는 자원들
				idx = idx + 1;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				result = result + idx;
				// 잠깐 쉴 때 여기까지 안가고 위에서 idx를 증가시키고 내려올수 있다.
				// 이럴 때는 메도스 옆에 synchronized를 붙여주면 해결됨
				// 저 것을 안 붙여 줬을때는 제대론 된 값을 얻을 수 없다.
			}
		}
	}

	@Override
	public void run() {
		sum(); // sum을 부른 것이다.

	}

	// result 값을 리턴해주는 메소드
	public int getResult() { // result가 private 밖에서 쓰려고 만든 메소드
		return result;
	}

}
