
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 0;
		int max = 0;
		
		int[] intarr = {A,B,C};
		
		if (A == B && B == C ) {
			result = 10000+(A*1000);
		}else if (A == B && B != C || B==C && C != A ) {
			result = 1000+(B*100);
		}else if ( A==C && B != C) {
			result = 1000+(A*100);
		}else {
			max = Math.max(Math.max(intarr[0], intarr[1]), intarr[2]);
			result = max*100;
		}
		System.out.println(result);
	}
}
