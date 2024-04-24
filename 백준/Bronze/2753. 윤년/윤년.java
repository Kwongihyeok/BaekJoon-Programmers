import java.util.Scanner;

public class Main {
	public static int a;
	
	public Main(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a % 4 == 0 && a % 100 != 0) {
			System.out.println("1");
		}else if (a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
			
		

	}

}
