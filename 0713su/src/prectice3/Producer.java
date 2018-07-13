package prectice3;

import java.util.ArrayList;

public class Producer extends Thread {
	private SharedData shareData;

	// 생성자 - 다른 곳에서 받아 올려면 사용
	public Producer(SharedData shareData) {
		this.shareData = shareData;
		// 리스트를 받아서 리스트를 위에 넣어 준다 SharedData에 리스트를 받아온다.
	}

	// 스레드로 동작할 메소드이다.
	public void run() { // run에서 부를 때 스레드로 동작한다.
		for (int i = 0; i < 26; i = i + 1) {
			// 65에 i를 더해서 문자로 변경한 후 sava 메소드에게 전달
			shareData.save((char) (65 + i));
		}
	}
}
