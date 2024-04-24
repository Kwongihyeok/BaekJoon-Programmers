import java.util.Scanner;

public class Main {
	
	static int x;
	static int y;
	static int t;

	public Main(int x, int y, int t) {
		super();
		this.x = x;
		this.y = y;
		this.t = t;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("Case #"+i+": "+(x+y));
			
		}

	}

}
