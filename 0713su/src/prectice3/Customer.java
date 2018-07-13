package prectice3;

import java.util.ArrayList;

//List에서 데이터를 26번 꺼내서 출력하는 메소드
public class Customer extends Thread {
	private SharedData shareData;
	
	public Customer(SharedData shareData) {
		this.shareData = shareData;
	}
	
	
	// 스레드로 수행할 내용을 가지는 메소드
	public void run() {
		for (int i = 0; i < 26; i = i + 1) {
			shareData.get();
		}
	}
}
