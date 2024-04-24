import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		c = sc.nextInt();
		int arr[] = new int [c];
			
		for (int i = 0; i < c; i++) {
			int a;
			int b;
			a =sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
			System.out.println(arr[i]);
		}
		
	}

}
