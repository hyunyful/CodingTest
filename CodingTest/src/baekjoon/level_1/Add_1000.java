package baekjoon.level_1;

import java.util.Scanner;

public class Add_1000 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		
		System.out.print(A+B);

	}

}
