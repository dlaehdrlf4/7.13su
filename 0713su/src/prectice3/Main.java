package prectice3;

public class Main {

	public static void main(String[] args) {
		SharedData shareData = new SharedData();
		
		Producer producer = new Producer(shareData);
		Customer costomer = new Customer(shareData);
		
		producer.start();
		costomer.start();
	}

}
