package study_200920;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		
		/*
		주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 
		다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
		
		주어진 수들 중 소수의 개수를 출력한다.
		
		ex)
		4
		1 3 5 7
		
		3
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		int result = 0;
		
		for(int i=0;i<N;i++) {
			int num = scan.nextInt();
			int cnt = 0;
			
			for(int j=1;j<=num;j++) {	
				if(num % j == 0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}

}
