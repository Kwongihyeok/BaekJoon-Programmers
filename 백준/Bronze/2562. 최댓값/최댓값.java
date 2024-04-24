import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int max = 0;
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			if (n > max) {
				count = i;
				max = n;
			}
		}
		System.out.println(max);
		System.out.println(count + 1);
		
	}
}


