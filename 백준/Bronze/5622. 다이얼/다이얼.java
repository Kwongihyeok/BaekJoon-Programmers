

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str_input;
		
		str_input = sc.next();
		int int_number;
		int int_time=0;
		char char_exam;
		String exam = "";
		if (str_input.length() <= 15 && str_input.length() >= 2) {
			
			for (int i = 0; i < str_input.length(); i++) {
				char_exam = str_input.charAt(i);
				exam = char_exam+"";
				switch (exam) {
				case "A":
				case "B":
				case "C":
					int_time += 3;
					break;
				case "D":
				case "E":
				case "F":
					int_time += 4;
					break;
				case "G":
				case "H":
				case "I":
					int_time += 5;
					break;
				case "J":
				case "K":
				case "L":
					int_time += 6;
					break;
				case "M":
				case "N":
				case "O":
					int_time += 7;
					break;
				case "P":
				case "Q":
				case "R":
				case "S":
					int_time += 8;
					break;
				case "T":
				case "U":
				case "V":
					int_time += 9;
					break;
				case "W":
				case "X":
				case "Y":
				case "Z":
					int_time += 10;
					break;
				default:
					break;
				}
				
			}
			System.out.println(int_time);
		}else {
			System.out.println("잘못 입력 되었습니다.");
		}
		
		
	}
}
