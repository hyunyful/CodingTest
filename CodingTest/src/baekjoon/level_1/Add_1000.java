package baekjoon.level_1;

import java.util.Scanner;

public class Add_1000 {

	public static void main(String[] args) {
		
		/*
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		 1 2 -> 3
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		
		System.out.print(A+B);

	}

}
