package BH1;
import java.util.Scanner;

public class B16 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.out.println("Bai tap 1");
		System.out.println("19H1120075 - Dinh Quang Huy");
		System.out.println("Nhap so nguyen n:");
		@SuppressWarnings("resource")
		Scanner so = new Scanner(System.in);
		int n = so.nextInt();
		Thread th1 = new Thread(new thr1(n, "Thread 1"));
		Thread th2 = new Thread(new thr2(n, "Thread 2"));
		th2.start();
		th1.start();
		th2.join();
		th1.join();
	}
}
class thr1 implements Runnable{
	int n;
	String threadName;
	public thr1(int n, String threadName) {
		this.n = n;
		this.threadName = threadName;
	}
	@Override
	public void run() {
		for (int i = 1; i <= n; i+=2) {
			System.out.println("So le cua " +threadName+ " la: "+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
 class thr2 implements Runnable{
	 int n;
	 String threadName;
	 public thr2(int n, String threadName) {
			this.n = n;
			this.threadName = threadName;
		}
	 @Override
	 public void run() {
		 for (int i = 0; i <= n; i+=2) {
			 System.out.println("So chan cua " +threadName+ " la: "+i);
			 try {
				 Thread.sleep(100);
				 } catch (Exception e) {
				}
			 }
		 }
}