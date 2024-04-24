import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] intarr;
		intarr = new int[cnt];
		
		for (int i = 0; i < cnt; i++) {
			intarr[i] = sc.nextInt();
		}
		
		int result = sc.nextInt();
		int result_cnt = 0;
		
		for (int i = 0; i < cnt; i++) {
			if(intarr[i] == result) {
				result_cnt++;
			}
		}
		System.out.println(result_cnt);
	}
}
