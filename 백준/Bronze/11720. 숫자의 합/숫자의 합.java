import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //숫자의 갯수
		int sum = 0;
		String a = sc.next(); //숫자 입력
		sc.close();
		for (int i = 0; i < N; i++) {	
			sum += a.charAt(i)-'0'; 
		}
		System.out.print(sum);
		
	}

}
