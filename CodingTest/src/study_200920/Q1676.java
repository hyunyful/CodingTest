package study_200920;

import java.util.Scanner;

public class Q1676 {

	public static void main(String[] args) {

		/*
		N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
		첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
		첫째 줄에 구한 0의 개수를 출력한다.
		
		ex)
		10			(10!는 3628800)
		
		2
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		int result = 0;
	
		for( int i = 5; i<= N; i*=5) {    
			result += N/i;
        }
		
		System.out.println(result);

	}

}
