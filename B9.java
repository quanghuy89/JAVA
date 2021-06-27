package BH1;

public class B9 {
	   public static void main(String[] args) {
	       Xuatkitu('(', 'z', 20);
	    }
	 public static void Xuatkitu(char char1, char char2, int n) {
		 System.out.print("Cac ky tu sau :\n");
	        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
	            System.out.print(char1 + " ");
	            if (ctr % n == 0) 
	            	System.out.println("");
	        }
			System.out.print("\n");
	    }
	}