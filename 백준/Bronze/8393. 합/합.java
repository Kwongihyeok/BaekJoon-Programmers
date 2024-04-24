import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int sum;
		a = sc.nextInt();
		sum = 0;
		
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
