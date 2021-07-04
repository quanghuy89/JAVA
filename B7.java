package BH1;
public class B7 {
public static void main(String[] args) {
   		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",Songugiac(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int Songugiac(int i) {
		return (i * (3 * i - 1))/2;
	}
}