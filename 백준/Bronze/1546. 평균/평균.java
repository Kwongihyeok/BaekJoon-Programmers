

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//최댓값 -> M
		//모든 점수 -> 점수/M*100
		//ex) 최고점 70
		//	  수학 50점(int) -> 50/70*100 -> 71.43(double)
		Scanner sc = new Scanner(System.in);
		
		int n; //과목 개수
		double m = 0; //최댓값
		double result; //평균
		int t; //성적
		double sum = 0; //성적 합
		//과목수 입력
		n = sc.nextInt();
		double[] arr = new double[n];
		
		
		//과목 성적 입력
		for (int q = 0; q < n; q++) {
			t = sc.nextInt();
			arr[q] = t;
		}
		
		//쵀댓값 구하기
		for (int e = 0; e < arr.length; e++) {
			if(m<arr[e])
				m = arr[e];
		}
		
		//성적 수정
		for (int w = 0; w < arr.length; w++) {
			arr[w] = arr[w]/m*100;
		}
//		for (int p = 0; p < arr.length; p++) {
//			System.out.println(arr[p]);
//		}
		//평균 구하기
		for (int r = 0; r < arr.length; r++) {
			sum += arr[r];
		}
		
		result = sum/n;
		
		System.out.println(result);
		
		
	}
}
