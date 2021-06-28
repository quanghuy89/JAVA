package BH1;

import java.util.Scanner;
public class B8 {
 
 public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in); 
    System.out.print("Nhap so tien ban muon dau tu : ");
 	double investment = in.nextDouble();
 	System.out.print("Nhap lai suat hang nam : ");
	double rate = in.nextDouble();
	System.out.print("Nhap so nam ban gui tien : ");
	int year = in.nextInt();
	
	rate = rate* 0.01;
	
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
       }
	 }
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}