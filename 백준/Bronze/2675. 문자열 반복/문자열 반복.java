

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int t;
		int r;
		String p;
		t = sc.nextInt();
		String result = "";
		for (int z = 0; z < t; z++) {
			r = sc.nextInt();
			p = sc.next();
			for (int x = 0; x < p.length(); x++) {
				for (int c = 0; c < r; c++) {
					result += (p.charAt(x));
				}
			}
			result +=  "\n";
		}System.out.println(result);
		
	}
}
