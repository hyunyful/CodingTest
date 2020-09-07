package baekjoon.level_3;

import java.util.Scanner;

public class PrintStar_2438 {

	public static void main(String[] args) {

		/*
		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		
		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		ex)
		5
		
		*
		**
		***
		****
		*****
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
