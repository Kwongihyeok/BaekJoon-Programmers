
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		String S;
		
		Scanner sc = new Scanner(System.in);
		
		S = sc.next();
		i = sc.nextInt();
		
		char c = S.charAt(i-1);
		System.out.println(c);
		
	}

}
