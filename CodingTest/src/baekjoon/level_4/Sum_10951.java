package baekjoon.level_4;

import java.util.Scanner;

public class Sum_10951 {

	public static void main(String[] args) {

		/*
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		입력은 여러 개의 테스트 케이스로 이루어져 있다.
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		각 테스트 케이스마다 A+B를 출력한다.
		
		ex)
		1 1
		2 3
		3 4
		9 8
		5 2
		
		2
		5
		7
		17
		7
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int A = -1;
		int B = -1;	
		
		while(scan.hasNext()) {
			try {
				String input = scan.nextLine();
				
				A = Integer.parseInt(input.split(" ")[0]);
				B = Integer.parseInt(input.split(" ")[1]);
				
				System.out.println(A+B);
			}catch (Exception e){
				break;
			}
		}
		
	}

}
