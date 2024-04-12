
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		for (int j = 0; j < n; j++) {
			System.out.print(arr[j].charAt(0));
			int a = arr[j].length();
			System.out.println(arr[j].charAt(a-1));
		
		}
		
	}
}
