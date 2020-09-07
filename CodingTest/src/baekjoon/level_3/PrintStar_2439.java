package baekjoon.level_3;

import java.util.Scanner;

public class PrintStar_2439 {

	public static void main(String[] args) {
		
		/*
		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오.
		
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
			for(int j=0;j<N;j++) {
				if(i+j >= (N-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
