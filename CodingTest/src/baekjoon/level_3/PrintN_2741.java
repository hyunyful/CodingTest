package baekjoon.level_3;

import java.util.Scanner;

public class PrintN_2741 {

	public static void main(String[] args) {

		/*
		자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=N;i++) {
			System.out.println(i);
		}
	}

}
