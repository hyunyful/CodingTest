package baekjoon.level_3;

import java.util.Scanner;

public class Gugudan_2739 {

	public static void main(String[] args) {

		/*
		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
		첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		2 입력시
		
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=9;i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
	}

}
