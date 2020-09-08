package baekjoon.level_5;

import java.util.Scanner;

public class PrintStar_2523 {

	public static void main(String[] args) {

		/*
		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		
		ex)
		3
		
		*
		**
		***
		**
		*
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		//N행까지는 하나씩 늘려가면서
		for (int i = 1; i <= N; i++){	
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
		//그 후에는 N-1번만큼 하나씩 줄여가면서
		for (int i = N-1; i > 0; i--){	
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
