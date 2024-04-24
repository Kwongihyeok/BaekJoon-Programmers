import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int cnt = sc.nextInt();
		
		int[] intarr_price, intarr_cnt;
		intarr_price = new int[cnt];
		intarr_cnt = new int[cnt];
		
		
		int result = 0;
		
		for (int i = 0; i < cnt; i++) {
			intarr_price[i] = sc.nextInt();
			intarr_cnt[i] = sc.nextInt();
		}
		for (int i = 0; i < cnt; i++) {
			result += (intarr_price[i]*intarr_cnt[i]);
		}
		if (sum == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
