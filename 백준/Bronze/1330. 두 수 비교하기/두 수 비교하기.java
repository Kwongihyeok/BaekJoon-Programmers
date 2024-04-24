import java.util.Scanner;


public class Main {
	int A;
	int B;
	
	public Main(int A, int B) {
		this.A = A;
		this.B = B;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
		int B = sc.nextInt();
		Main me = new Main(A, B);
		
		    if (A>B && A>=-10000 && B<=10000) {
			    System.out.println(">");
			}
			else if (A<B && A>=-10000 && B<=10000){
				System.out.println("<");
	        }
		    else if (A==B && A>=-10000 && B<=10000) {
				    System.out.println("==");
			
		    }
	    }
	}
