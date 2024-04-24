import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result_h = 0;
		int result_m = 0;
		
		int start_h = sc.nextInt();
		int start_m = sc.nextInt();
		int time = sc.nextInt();
		
		int hour_to_min = start_h * 60;
		int result = hour_to_min + start_m + time;
		
		result_m = result%60;
		result_h = result/60;
		
		if(result_h < 24) {
			System.out.println(result_h+" "+result_m);
		}else if (result_h >= 24) {
			System.out.println(result_h-24+" "+result_m);
		}
		
	}
}
