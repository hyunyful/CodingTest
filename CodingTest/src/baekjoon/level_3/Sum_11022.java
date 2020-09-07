package baekjoon.level_3;

import java.util.Scanner;

public class Sum_11022 {

	public static void main(String[] args) {

		/*
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		
		ex)
		5
		1 1
		2 3
		3 4
		9 8
		5 2
		
		Case #1: 1 + 1 = 2
		Case #2: 2 + 3 = 5
		Case #3: 3 + 4 = 7
		Case #4: 9 + 8 = 17
		Case #5: 5 + 2 = 7
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=T;i++) {
			String input = scan.nextLine();
			
			int A = Integer.parseInt(input.split(" ")[0]);
			int B = Integer.parseInt(input.split(" ")[1]);
			
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}

	}

}
