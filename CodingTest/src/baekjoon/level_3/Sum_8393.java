package baekjoon.level_3;

import java.util.Scanner;

public class Sum_8393 {

	public static void main(String[] args) {

		/*
		n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		
		3 -> 6
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		int n = Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}

		System.out.println(sum);
	}

}
