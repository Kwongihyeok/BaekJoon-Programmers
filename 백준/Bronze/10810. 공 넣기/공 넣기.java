

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] arr = new int[n];
		
		for (int l = 0; l < arr.length; l++) {
			arr[l] = 0;
		}
		
		for (int p = 0; p < m; p++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for (int z = i; z <= j; z++) {
				arr[z-1] = k;
			}
		}
		
		for (int o = 0; o < arr.length; o++) {
			System.out.print(arr[o]+" ");
		}
	}
}
