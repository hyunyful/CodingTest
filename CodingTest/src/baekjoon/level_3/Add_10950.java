package baekjoon.level_3;

import java.util.Scanner;

public class Add_10950 {

	public static void main(String[] args) {

		/*
		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		각 테스트 케이스마다 A+B를 출력한다.
		
		예)
		입력>
		5					> T
		1 1				>테스트 케이스들
		2 3
		3 4
		9 8
		5 2
		
		출력>
		2
		5
		7	
		17
		7
		*/

		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<T;i++) {
			String input = scan.nextLine();
			
			int A = Integer.parseInt(input.split(" ")[0]);
			int B = Integer.parseInt(input.split(" ")[1]);
			
			System.out.println(A+B);
		}
	}

}
