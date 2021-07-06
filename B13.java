package BH1;

public class B13 {
	public static void main(String[] args) {
		System.out.println("=====Exception Exercies=====");
		System.out.println("19H1120075-Dinh Quang Huy");
		float n = 0;
		int num_error = 0;
		for (int i = 0; i < 2021; i++) {
			try {
				n += ((i * i * i * i * i * i * i) / (i % 123));
			} catch (Exception ex) {
				num_error++;
			}
		}
		System.out.println("The number of i values that cause is " + num_error);
		System.out.println("Final value of s is " + n);
		System.out.println("Everything is OK");
	}
}
