import java.util.Scanner;

public class Main {
	static int a; //a값
	static int b; //b값
	static int x; //테스트 케이스
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #"+i+": "+ a + " + " + b + " = " + (a+b));
		}
	}

}
