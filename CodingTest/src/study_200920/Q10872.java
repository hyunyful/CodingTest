package study_200920;

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {

		/*
		0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
		
		첫째 줄에 N!을 출력한다.
		
		ex)
		10
		
		3628800
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		int n = 1;
		int result = 1;
		
		do {
			result = result*n;
			n = n+1;
		}while(n <= N);

		System.out.println(result);
		
	}

}
