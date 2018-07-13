package threadpack;

public class GungjuMain {

	public static void main(String[] args) {
		
		Gungju h1 = new Gungju();
		Gungju h2 = new Gungju();
		Gungju h3 = new Gungju();
		Gungju h4 = new Gungju();
		Gungju h5 = new Gungju();

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}

}
