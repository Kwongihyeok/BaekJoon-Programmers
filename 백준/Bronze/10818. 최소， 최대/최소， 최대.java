import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min+" "+max);

	}

}
