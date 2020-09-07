package baekjoon.level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumUnderX_10871 {

	public static void main(String[] args) {

		/*
		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		
		X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
		X보다 작은 수는 적어도 하나 존재한다.
		
		ex)
		10 5
		1 10 4 9 2 3 8 5 7 6
		
		1 4 2 3
		*/

		Scanner scan = new Scanner(System.in);
		
		//10 5 받기
		String input = scan.nextLine();
	
		int N = Integer.parseInt(input.split(" ")[0]);
		int X = Integer.parseInt(input.split(" ")[1]);
		
		//결과를 저장할 리스트
		List<Integer> result = new ArrayList<>();
		
		//1 10 4 9 2 3 8 5 7 6를 받으면서 X보다 작은지 체크해서 리스트에 저장
		for(int i=0;i<N;i++) {
			int n = scan.nextInt();
			
			if(n < X) {
				result.add(n);
			}
		}
		
		//리스트 출력
		for(int n:result) {
			System.out.print(n+" ");
		}
		
	}

}
