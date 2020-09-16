package study_200920;

import java.util.Scanner;

public class Rest_10430 {

	public static void main(String[] args) {
		
		/*
		첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000) 
		
		첫째 줄에 (A+B)%C, 
		둘째 줄에 ((A%C) + (B%C))%C, 
		셋째 줄에 (A×B)%C, 
		넷째 줄에 ((A%C) × (B%C))%C 를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		int C = Integer.parseInt(input.split(" ")[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

	}

}