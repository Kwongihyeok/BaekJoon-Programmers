
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_byte = sc.nextInt();
		int times = (input_byte-4)/4;
		
		String result = "";
		
		for (int i = 1; i <= times; i++) {
			result = result + "long ";
		}
		System.out.println(result + "long int");
		
	}
}
