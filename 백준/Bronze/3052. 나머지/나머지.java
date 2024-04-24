import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int scnt = 0; // 나머지가 같을 때
		int cnt = 0; // 나머지가 다를 때
		
		for(int i = 0; i<10; i++) {
			num[i] = sc.nextInt()%42;
		}
		for (int i = 0; i < 10; i++) {
			scnt = 0;
			for (int j = i+1; j <10; j++) {
				if(num[i] == num[j])
					scnt++;
			}
			if (scnt == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
