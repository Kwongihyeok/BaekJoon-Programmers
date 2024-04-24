import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //바구니 수
		int m = sc.nextInt(); //섞는 횟수
		
		int[] arr = new int[n];
		
		//바구니 숫자 부여
		for (int q = 0; q < arr.length; q++) {
			arr[q] = q+1;
		
		}
		/// 순서 바꾸기
		int i;
		int j;
		int sample;
		
		
		for (int w = 0; w < m; w++) {
			i = sc.nextInt()-1;
			j = sc.nextInt()-1;
			int a = i;
			int b = j;
			// i번째부터 j번째까지 역순
			/* 배열을 j-i개 생성
			 * 순서대로 반대로 입력
			 * ex) 4개 -> 새로운 배열 4개 생성
			 *  입력은 역순으로 진행
			 *  j -> i 순 넣고
			 *  값 옮기기
			 */
			sample = j-i+1;
			int[] samplearr = new int[sample];
			for (int e = 0; e < samplearr.length; e++) {
				if(j>=i) {
					samplearr[e] = arr[j];
					j--;
				}
			
			}
			for (int y = 0; y < samplearr.length; y++) {
				if(a <= b) {
					arr[a] = samplearr[y];
					a++;
				}
			}
			
			
		}
		//출력
		for (int t = 0; t < arr.length; t++) {
			System.out.print(arr[t]+" ");
		}
	}
}
