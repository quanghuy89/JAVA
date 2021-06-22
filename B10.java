package BH1;

import java.util.Scanner;

public class B10 {
 
 public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("Nhap nam vao day : ");
        int year = in.nextInt();

        System.out.println(check_namnhuan(year));
    }
 
 public static boolean check_namnhuan(int y)
    {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}