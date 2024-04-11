

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		int z;
		
		for (int a = 0; a < arr.length; a++) {
			arr[a] = a+1;
		}
		
		for (int b = 1; b <= m; b++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			z = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = z;
		}
		
		for (int g = 0; g < arr.length; g++) {
			System.out.print(arr[g]+" ");
			
		}
	}
}
