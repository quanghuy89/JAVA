package BH1;

import java.util.Scanner;

public class B12 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		xuatmatran(n);
	}

	public static void xuatmatran(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}