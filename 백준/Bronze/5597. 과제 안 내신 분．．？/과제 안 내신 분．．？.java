import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] studentarr;
		studentarr = new int[31];
		for (int z = 1; z < 29; z++) {
			int success = sc.nextInt();
			studentarr[success] = 1;	
		}
		
		for (int j = 1; j < studentarr.length; j++) {
			if(studentarr[j]!= 1) {
				System.out.println(j);
			}
		}
	}
}
