
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int A;
		int B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		String str_A = A+"";
		String str_B = B+"";
		
		StringBuffer strsb_A = new StringBuffer(str_A);
		StringBuffer strsb_B = new StringBuffer(str_B);
		
		String str_reverse_A = strsb_A.reverse().toString();
		String str_reverse_B = strsb_B.reverse().toString();
		
		int int_reverse_A = Integer.parseInt(str_reverse_A);
		int int_reverse_B = Integer.parseInt(str_reverse_B);
		
		if (int_reverse_A > int_reverse_B) {
			System.out.println(int_reverse_A);
		}else {
			System.out.println(int_reverse_B);
		}
				
	}
}
