package study_200920;

import java.util.Scanner;

public class Q2609 {

	public static void main(String[] args) throws Exception {

		/*
		두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
		첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
		첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
		
		ex)
		24 18
		
		6
		72
		*/
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.nextLine();
		
		//최대공약수는 나머지가 0이 아니게 될때까지 나뉜 수
		//최소공배수는 최대공약수와 그렇게 나뉜 나머지를 다 곱한다
		
		int CD = 1;		//공약수
		int CM = 1;		//공배수
		
		int quo = A;		//몫
		int rest = 0;		//나머지
		
		int n = 2;			//나누는 수
		
		do {
			
		}while(rest == 0);
		
		System.out.println(CD+" "+rest+" "+quo);
		
	}

}
